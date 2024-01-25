package org.example.hexlet;

import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.CoursesBase;
import org.example.hexlet.dto.users.UserPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AppRender {

    private static final List<User> USERS = Data.getUsers();
    private static final List<Course> COURSES = CoursesBase.getCourseBase();

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });
        app.get("/courses", ctx -> {
            var page = new CoursesPage(COURSES, "Курсы по программированию");
            ctx.render("courses/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Integer.class).get();
            var page = new CoursePage(COURSES.stream().filter(c -> Objects.equals(c.getId(), id)).findFirst().orElseThrow());
            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });
        app.get("/users", ctx -> {
            var page = new UsersPage("List of users", USERS);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();
            var page = new UserPage(USERS.stream().filter(u -> Objects.equals(u.getId(), id)).findFirst().orElseThrow());
            ctx.render("users/show.jte", Collections.singletonMap("page", page));
        });

        return app;
    }
}
