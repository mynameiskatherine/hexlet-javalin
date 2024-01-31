package org.example.hexlet;

import io.javalin.Javalin;
import org.example.hexlet.controller.UsersController;

public class AppWControllers {
    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/users", UsersController::index);
        app.get("/users/{id}", UsersController::show);
        app.get("/users/build", UsersController::build);
        app.post("/users", UsersController::create);
        app.get("/users/{id}/edit", UsersController::edit);
        app.patch("/users/{id}", UsersController::update);
        app.delete("/users", UsersController::destroy);

        return app;
    }
}
