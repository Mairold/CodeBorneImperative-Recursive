import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibbonacciTest {

    private final Fibbonacci fibbonacci = new Fibbonacci();

    @Test
    void calculate_1() {
        assertEquals(0, fibbonacci.fibbonacciNumberAtPosition(1));
    }

    @Test
    void calculate_2() {
        assertEquals(1, fibbonacci.fibbonacciNumberAtPosition(2));
    }

    @Test
    void calculate_10() {
        assertEquals(34, fibbonacci.fibbonacciNumberAtPosition(10));
    }

    @Test
    void calculate_20() {
        assertEquals(4181, fibbonacci.fibbonacciNumberAtPosition(20));
    }
}
