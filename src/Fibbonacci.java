import java.util.HashMap;
import java.util.Map;

public class Fibbonacci {
    private final Map<Integer, Long> fibCache = new HashMap<>();

    public long fibbonacciNumberAtPosition(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed!");
        }
        if (fibCache.get(n) == null) {
            long result = n < 3 ? n - 1 : fibbonacciNumberAtPosition(n - 1) + fibbonacciNumberAtPosition(n - 2);
            fibCache.put(n, result);
            return result;
        } else {
            return fibCache.get(n);
        }
    }
}
