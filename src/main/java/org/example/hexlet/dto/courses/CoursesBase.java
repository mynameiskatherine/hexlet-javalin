package org.example.hexlet.dto.courses;

import org.example.hexlet.model.Course;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Supplier;

public class CoursesBase {
    private static List<Course> courseList = List.of(new Course("Java", "Java Basics"),
            new Course("Python", "Python Basics"),
            new Course("PHP", "PHP Basics"),
            new Course("C++", "C++ Basics"),
            new Course("C", "C Basics"),
            new Course("JS", "JS Basics"),
            new Course("Ruby", "Ruby Basics"));

    public static List<Course> getCourseBase() {
        return courseList;
    }
}
