package chapter2.b.sub3;

import org.apache.commons.math3.complex.Complex;
import org.junit.Assert;
import org.junit.Test;

import static chapter2.b.sub3.Task3.*;

public class QuadraticEquation {

    @Test
    public void testDiscriminant() {
        RootPair roots = findRoots(1, -3, 2);
        Assert.assertEquals(new Complex(2.0, 0.0), roots.getX1());
        Assert.assertEquals(new Complex(1.0, 0.0), roots.getX2());

        roots = findRoots(1, 11, 30);
        Assert.assertEquals(new Complex(-5.0, 0.0), roots.getX1());
        Assert.assertEquals(new Complex(-6.0, 0.0), roots.getX2());

        roots = findRoots(61/60.0, 11, 30);
        Assert.assertEquals(0, Double.compare(0.5, roots.getX1().getImaginary()));
        Assert.assertEquals(0, Double.compare(-0.5, roots.getX2().getImaginary()));

        roots = findRoots(1, -2, 1);
        Assert.assertTrue(roots.getX1().equals(roots.getX2()));

        roots = findRoots(new Complex(1), new Complex(-5, 6), new Complex(-1, -9));
        Assert.assertEquals(new Complex(4, -5), roots.getX1());
        Assert.assertEquals(new Complex(1, -1), roots.getX2());
    }
}
