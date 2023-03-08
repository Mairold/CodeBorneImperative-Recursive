import java.util.ArrayList;

public class Fibbonacci {

    public int fibbonacciNumberAtPosition(int n) {
        return n < 3 ? n-1 : fibbonacciNumberAtPosition(n-1) + fibbonacciNumberAtPosition(n-2);
    }
}
