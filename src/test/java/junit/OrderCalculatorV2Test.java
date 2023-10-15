package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* This test class checks id OrderCalculatorV2 is working properly or not.
 */
class OrderCalculatorV2Test {

    // This Test checks whether calculateTotal(...) works properly

    @Test
    public void testCalculateTotal () {
        // given (assumptions come here)
        OrderCalculatorV2 testObj = new OrderCalculatorV2();
        double itemPrice = 100;
        int itemCount = 3;
        double taxRate = 0.1;
        double discount = 50;
        double discountThreshold = 200;
        double expectedTotal = (itemPrice * itemCount * (1 + taxRate)) - discount;

        // when (execution of the subject under test[SUT])
        double actualTotal = testObj.calculateTotal(itemPrice, itemCount, taxRate, discount, discountThreshold);


        // then (verifications / assertions come here)
        assertEquals(expectedTotal, actualTotal);

    }

}