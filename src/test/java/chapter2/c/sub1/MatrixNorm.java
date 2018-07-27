package chapter2.c.sub1;

import org.junit.Assert;
import org.junit.Test;

public class MatrixNorm {

    @Test
    public void testNorm() {
        int[][] testArray = {{1,1},{1,1}};
        double norma = Task1.norm(testArray);
        Assert.assertEquals(0, Double.compare(2, norma));
    }

    @Test
    public void testNorm1() {
        int[][] testArray = {{-5,-6},{-7,-8}};
        double norma = Task1.norm(testArray);
        Assert.assertTrue(norma > 13.19);
        Assert.assertTrue(norma < 13.191);
    }
}
