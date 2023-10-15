package junit;

/*
* Now let's say a new requirement is added to apply the discount
* only if the order`s total price (before tax) is greater than a certain
 */

public class OrderCalculatorV2 {

    public double calculateTotal(double itemPrice, int itemCount, double taxRate, double discount, double discountThreshold) {
        double totalPrice = itemPrice * itemCount; // total price before tax

        totalPrice *= (1+taxRate);

        // Apply the discount only if the order's total price (before tax) is greater than a threshold
        if (totalPrice > discountThreshold) {
            totalPrice -= discount;
        }

        return totalPrice;
    }


    public static void main(String[] args){
        OrderCalculatorV2 calculatorV2 = new OrderCalculatorV2();
        double total = calculatorV2.calculateTotal(100, 3, 0.1, 50, 200);
        System.out.println("Total price: " + total);
    }
}
