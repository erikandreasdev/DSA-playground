import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void testFibonacci() {
        // Casos base
        assertEquals(0, fibonacci.calculate(0));
        assertEquals(1, fibonacci.calculate(1));

        // Casos adicionales
        assertEquals(1, fibonacci.calculate(2));
        assertEquals(2, fibonacci.calculate(3));
        assertEquals(3, fibonacci.calculate(4));
        assertEquals(5, fibonacci.calculate(5));
        assertEquals(8, fibonacci.calculate(6));
        assertEquals(13, fibonacci.calculate(7));
        assertEquals(21, fibonacci.calculate(8));
        assertEquals(34, fibonacci.calculate(9));
        assertEquals(55, fibonacci.calculate(10));
    }

    @Test
    void testNegativeInput() {
        // Comprobar si arroja excepción para entrada negativa
        assertThrows(IllegalArgumentException.class, () -> fibonacci.calculate(-1));
    }

    @Test
    void testLargeNumber() {
        // Prueba con número grande para comprobar eficiencia
        assertEquals(102334155, fibonacci.calculate(40));
    }
}