import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    void calculate_0() {
        assertEquals(BigInteger.valueOf(1L), factorial.calculate(0));
    }

    @Test
    void calculate_1() {
        assertEquals(BigInteger.valueOf(1L), factorial.calculate(1));
    }

    @Test
    void calculate_2() {
        assertEquals(BigInteger.valueOf(2L), factorial.calculate(2));
    }

    @Test
    void calculate_11() {
        assertEquals(BigInteger.valueOf(39916800L), factorial.calculate(11));
    }

    @Test
    void calculate_15() {
        assertEquals(BigInteger.valueOf(1307674368000L), factorial.calculate(15));
    }

    @Test
    void calculate_20() {
        assertEquals(BigInteger.valueOf(2432902008176640000L), factorial.calculate(20));
    }

    @Test
    void calculate_50() {
        BigInteger bigInt = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        assertEquals(bigInt, factorial.calculate(50));
    }

    @Test
    void calculate_57() {
        BigInteger bigInt = new BigInteger("40526919504877216755680601905432322134980384796226602145184481280000000000000");
        assertEquals(bigInt, factorial.calculate(57));
    }
}