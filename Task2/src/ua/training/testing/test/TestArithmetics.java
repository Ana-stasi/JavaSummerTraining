/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training.testing.test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.training.testing.calculation.Arithmetics;

public class TestArithmetics {

    private Arithmetics a;
    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @Before
    public void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(10, res, 0.0);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(21.0, res, 0.0);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4.0, res, 0.0);
    }

    @Test
    public void testDivide() {
        double res = a.divide(10, 5);
        Assert.assertEquals(2.0, res, 0.0);
    }

    // @Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.divide(10.0, 0.0);
    }

    @Test
    public void testN() {
        a.divide(10.0, 10.0);
    }
}
