package org.example.hexlet.dto.users;

import org.example.hexlet.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

// BEGIN
@AllArgsConstructor
@Getter
public class UsersPage {
    private String title;
    private List<User> userList;
}
// END
