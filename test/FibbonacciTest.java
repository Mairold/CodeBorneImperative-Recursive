import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibbonacciTest {

    private final Fibbonacci fibbonacci = new Fibbonacci();
    @Test
    void calculate() {
        assertEquals(0, fibbonacci.returnFibonacci(1));
    }
}
