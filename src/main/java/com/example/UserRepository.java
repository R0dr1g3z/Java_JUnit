package com.example;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> list = new ArrayList<>();

    public static void createUser(User user) {
        list.add(user);
    }

    public static void editUser(int id, User user) {
        for (User u : list) {
            if (u.getId() == id) {
                int number = list.indexOf(u);
                list.set(number, user);
            }
        }
    }

    public static void deleteUser(int id) {
        list.removeIf(u -> u.getId() == id);
    }

    public static User findUserById(int id) {
        for (User u : list) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
