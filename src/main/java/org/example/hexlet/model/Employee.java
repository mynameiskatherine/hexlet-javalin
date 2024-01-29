package org.example.hexlet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public final class Employee {
    private long id;
    private String firstName;

    @ToString.Include
    private String lastName;
    private String email;
}
