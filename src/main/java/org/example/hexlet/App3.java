package org.example.hexlet;

import io.javalin.Javalin;

public class App3 {
    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        return app;
    }
}
