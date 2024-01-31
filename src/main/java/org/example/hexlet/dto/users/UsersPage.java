package org.example.hexlet.dto.users;

import org.example.hexlet.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

// BEGIN
@AllArgsConstructor
@Getter
public class UsersPage {
    private List<User> userList;
    private String search;

    public UsersPage(List<User> userList) {
        this.userList = userList;
    }
}
// END
