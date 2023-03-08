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
        if (a < b) {
            return 0L;
        } else if (a == b) {
            return 1L;
        } else {
            long result = a;
            for (int i = b + 1; i < a; i++) {
                result *= i;
            }
            return result;
        }
    }
}