package com.commons;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    /*
    User user;

    @BeforeEach
    void createUser() {
        String username = "Alice";
        String password = "12345678";
        user = new User(username, password);
    }

    @Test
    void hasStrongPassword() {
        System.out.println("Testing for strong password");
        assertTrue(user.hasStrongPassword());
    }

    @Test
    void hasValidUsername() {
        System.out.println("Testing for valid username");
        assertTrue(user.hasValidUsername());
    }

    @Test
    void isValid() {
        System.out.println("Testing for valid user");
        assertTrue(user.isValid());
    }
    */

    static int number = 14;

    UserTest() {
        number *= 2;
    }

    @BeforeAll
    static void method3() {
        number += 11;
    }

    @BeforeEach
    void method2() {
        number -= 4;
    }

    @AfterAll
    static void method4() {
        number /= 3;
    }

    @AfterEach
    void method5() {
        System.out.println(number);
    }

    @Test
    void method6() {
        number += 9;
    }
}
