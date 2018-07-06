import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(7, calc.add(3,4), "ERROR");
    }

    @Test
    public void testSubstract() {
        assertEquals(-1, calc.substract(3,4), "ERROR");
    }

    @Test
    public void testMult() {
        assertEquals(12, calc.mult(3,4), "ERROR");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivZero() {
        assertEquals(3, calc.div(3,0), "Something wrong");
        }

    @Test
    public void testDiv() {
        assertEquals(1.5, calc.div(3,2), "ERROR");
    }
}