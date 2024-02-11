package org.example.hexlet;

public class App {

    public static void main(String[] args) throws Exception {
        var app = AppWJDBC.getApp();
        app.start(7070);
    }
}
