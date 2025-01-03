package com.commons;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void hasStrongPassword() {
        String username = "Alice";
        String password = "12345678";
        User user = new User(username, password);

        assertTrue(user.hasStrongPassword());
    }

    @Test
    void hasValidUsername() {
        String username = "Alice";
        String password = "12345678";
        User user = new User(username, password);

        assertTrue(user.hasValidUsername());
    }

    @Test
    void isValid() {
        String username = "Alice";
        String password = "12345678";
        User user = new User(username, password);

        assertTrue(user.isValid());
    }
}
