import java.math.BigInteger;

public class Factorial {

    public BigInteger calculate(int n) {
        if (n == 0) {
            return new BigInteger("1");
        } else {
            BigInteger result = new BigInteger("1");
            for (int i = 0; i < n; i++) {
                result = result.multiply(BigInteger.valueOf(n - i));
            }
            return result;
        }
    }

    public long calculateTwoNumbers(int a, int b) {
        return a < b ? 0L : a == b ? 1L : multiplyTwoNumberDifferences(a, b);
    }

    private long multiplyTwoNumberDifferences(int a, int b) {
        return a == 0 ? 1 : a == b ? b : a * multiplyTwoNumberDifferences(a - 1, b);
    }
}