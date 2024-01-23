package org.example.hexlet;

import io.javalin.Javalin;

public class App1 {
    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("users/{id}/post/{postId}", ctx -> {
            String userId = ctx.pathParam("id");
            String postId = ctx.pathParam("postId");
            ctx.result("User ID = " + userId + ", Post ID = " + postId);
        });

        return app;
    }
}
