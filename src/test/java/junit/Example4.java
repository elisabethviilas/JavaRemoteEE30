package junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Example4 {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Run BEFORE all tests");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Run BEFORE each test");
    }


    @Test
    public void first() {

        System.out.println("Implementation of the first test");
        assertTrue(1 != 0); // PASS
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Run AFTER all tests");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Run AFTER each test");
    }

    @Test
    public void second() {
        System.out.println("Implementation of the second test");
        assertTrue(1 != 0); // PASS
    }
}
