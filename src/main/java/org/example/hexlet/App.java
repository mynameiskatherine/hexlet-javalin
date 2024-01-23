package org.example.hexlet;

import io.javalin.Javalin;

public class App {
    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/users", ctx -> ctx.result("GET /users"));
        app.get("/hello", ctx -> {
            String name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });
        app.post("/users", ctx -> ctx.result("POST /users"));

        return app;
    }

    public static void main(String[] args) {
        var app = App1.getApp();
        app.start(7070);
    }
}
