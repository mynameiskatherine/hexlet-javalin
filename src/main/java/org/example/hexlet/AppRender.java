package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.validation.ValidationException;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.CoursesBase;
import org.example.hexlet.dto.employee.EmployeePage;
import org.example.hexlet.dto.employee.EmployeesPage;
import org.example.hexlet.dto.users.BuildUserPage;
import org.example.hexlet.dto.users.UserPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.Employee;
import org.example.hexlet.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.example.hexlet.repository.UserRepository;

public class AppRender {

    private static final List<Employee> EMPLOYEES = Data.getEmployees();
    private static final List<Course> COURSES = CoursesBase.getCourseBase();

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });
        app.get("/courses", ctx -> {
            var search = ctx.queryParam("search");
            List<Course> courses = new ArrayList<>();
            if (search != null) {
                courses = COURSES.stream().filter(c -> StringUtils.containsIgnoreCase(c.getName(), search) || StringUtils.containsIgnoreCase(c.getDescription(), search)).collect(Collectors.toList());
            } else {
                courses = COURSES;
            }
            var page = new CoursesPage(courses, "Курсы по программированию", search);
            ctx.render("courses/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Integer.class).get();
            var page = new CoursePage(COURSES.stream().filter(c -> Objects.equals(c.getId(), id)).findFirst().orElseThrow());
            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });
        app.get("/employees", ctx -> {
            var search = ctx.queryParam("search");
            List<Employee> employees = new ArrayList<>();
            if (search != null) {
                employees = EMPLOYEES.stream().filter(c -> StringUtils.containsIgnoreCase(c.getFirstName(), search) || StringUtils.containsIgnoreCase(c.getLastName(), search)).collect(Collectors.toList());
            } else {
                employees = EMPLOYEES;
            }
            var page = new EmployeesPage("List of Employees", employees, search);
            ctx.render("employees/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/employees/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();
            var page = new EmployeePage(EMPLOYEES.stream().filter(u -> Objects.equals(u.getId(), id)).findFirst().orElseThrow());
            ctx.render("employees/show.jte", Collections.singletonMap("page", page));
        });
        app.get("/users", ctx -> {
            var page = new UsersPage(UserRepository.getEntities(), null);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/users/build", ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/build.jte", Collections.singletonMap("page", page));
        });
        app.post("/users", ctx -> {
            var name = Objects.requireNonNull(ctx.formParam("name")).trim();
            var email = Objects.requireNonNull(ctx.formParam("email")).trim().toLowerCase();
            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .get();
                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect("/users");
            } catch (ValidationException e) {
                var page = new BuildUserPage(name, email, e.getErrors());
                ctx.render("users/build.jte", Collections.singletonMap("page", page));
            }
        });

        return app;
    }
}
