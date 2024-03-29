package org.example.hexlet.repository;

import org.example.hexlet.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository extends BaseRepository {
    private static List<User> entities = new ArrayList<>();

    public static void save(User user) {
        user.setId((long) (entities.size() + 1));
        entities.add(user);
    }

    public static void delete(Long id) {
        var user = UserRepository.find(id);
        entities.remove(user);
    }

    public static List<User> search(String term) {
        var users = entities.stream()
                .filter(entity -> entity.getName().startsWith(term))
                .toList();
        return users;
    }

    public static Optional<User> find(Long id) {
        var user = entities.stream()
                .filter(entity -> entity.getId().equals(id))
                .findAny();
        return user;
    }

    public static List<User> getEntities() {
        return entities;
    }
}
