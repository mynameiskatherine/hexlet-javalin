package org.example.hexlet;

import io.javalin.Javalin;
import org.example.hexlet.dto.CoursePage;
import org.example.hexlet.dto.CoursesPage;
import org.example.hexlet.dto.CoursesBase;
import org.example.hexlet.model.Course;

import java.util.Collections;

public class App2 {

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/courses", ctx -> {
            var courses = CoursesBase.getCourseBase();
            var header = "Курсы по программированию";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Integer.class).getOrDefault(0);
            var course = CoursesBase.getCourseById(id);
            var page = new CoursePage(course);
            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });
        return app;
    }
}
