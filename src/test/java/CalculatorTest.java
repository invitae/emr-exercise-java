import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23), " 19 + 23 should equal 42");
    }

    @Test
    public void testAddMaxInteger() {
        assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }

    @Test
    public void testAddZero() {
        assertEquals(21, Integer.sum(21, 0));
    }

    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> Integer.divideUnsigned(42, 0));
    }
}
