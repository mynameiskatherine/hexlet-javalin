package org.example.hexlet.utils;

public class NamedRoutes {
    public static String usersPath() {
        return "/users";
    }

    public static String buildUserPath() {
        return "/users/build";
    }

    public static String coursesPath() {
        return "/courses";
    }

    // Это нужно, чтобы не преобразовывать типы снаружи
    public static String coursePath(Long id) {
        return coursePath(String.valueOf(id));
    }

    public static String coursePath(String id) {
        return "/courses/" + id;
    }

    public static String carsPath() {
        return "/cars";
    }

    // Это нужно, чтобы не преобразовывать типы снаружи
    public static String carPath(Long id) {
        return carPath(String.valueOf(id));
    }

    public static String carPath(String id) {
        return "/cars/" + id;
    }
}
