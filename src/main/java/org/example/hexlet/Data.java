package org.example.hexlet;

import org.example.hexlet.model.Employee;
import org.example.hexlet.model.User;
import net.datafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Data {
    private static final long ITEMS_COUNT = 30;

    private static long idCounter = ITEMS_COUNT;

    public static List<Employee> getEmployees() {
        Random random = new Random(123);
        Faker faker = new Faker(new Locale("en"), random);

        List<Long> ids = LongStream
            .range(1, ITEMS_COUNT + 1)
            .boxed()
            .collect(Collectors.toList());
        Collections.shuffle(ids, random);

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < ITEMS_COUNT; i++) {
            var id = ids.get(i);
            var firstName = faker.name().firstName();
            var lastName = faker.name().lastName();
            var email = faker.internet().emailAddress();
            Employee employee = new Employee(id, firstName, lastName, email);
            employees.add(employee);
        }

        return employees;
    }

    public static long getNextId() {
        long id = ++idCounter;
        return id;
    }
}
