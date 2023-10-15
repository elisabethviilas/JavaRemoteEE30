package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        // given
        Calculator testObj = new Calculator();

        // when
        int actualResult = testObj.add(3, 5);

        // then
        assertEquals(8, actualResult);

    }

    // happy-path test - everything provided as we like it

    @Test
    void TestDivide() {
        // given
        Calculator testObj = new Calculator();

        // when
        int actualResult = testObj.divide(8, 2);

        // then
        assertEquals(4, actualResult);
    }

    @Test
    void testDivide_byZero_shouldReturnNegativeOne() {
        // given
        Calculator testObj = new Calculator();

        //when
        int actualResult = testObj.divide(8,0);

        //then
        assertEquals(-1, actualResult);
    }
}