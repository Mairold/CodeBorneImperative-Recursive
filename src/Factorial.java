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
}