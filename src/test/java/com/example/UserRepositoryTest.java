package com.example;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class UserRepositoryTest {

    @Test
    public void testCreateUser() {
        User user = new User(500, "James", "Kolin");
        UserRepository.createUser(user);
        assertSame(user, UserRepository.findUserById(user.getId()));
    }

    @Test
    public void testDeleteUser() {
        User user = new User(500, "Kalin", "Stone");
        UserRepository.createUser(user);
        UserRepository.deleteUser(500);
        assertNotSame(UserRepository.findUserById(user.getId()), user);
    }

    @Test
    public void testEditUser() {
        User user1 = new User(500, "John", "Walker");
        User user2 = new User(501, "Stin", "Kali");
        UserRepository.createUser(user1);
        UserRepository.editUser(500, user2);
        assertSame(user2, UserRepository.findUserById(user2.getId()));
        assertNotSame(user1, UserRepository.findUserById(user1.getId()));
    }
}
