import java.util.ArrayList;

public class Fibbonacci {

    public int fibbonacciNumberAtPosition(int n) {
        return n == 1 ? 0 : n == 2 ? 1 : fibbonacciNumberAtPosition(n-1) + fibbonacciNumberAtPosition(n-2);
    }
}
