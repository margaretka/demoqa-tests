package ru.mkalinina.docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before test\n");
    }

    @Test
    void firstTest() {
        System.out.println("I love you QA.GURU\n");
    }

    @Test
    void sevondTest() {
        System.out.println("I love you QA.GURU, 2\n");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After test\n");
    }
}
