package junit;

public class Calculator {
    public int add (int x, int y) {
        return x + y;
    }

    public int divide (int x, int y){
        if (y==0) {
            return -1;  // later we'll handle this edge case by throwing exceptions
        }
        return x / y;
    }
}
