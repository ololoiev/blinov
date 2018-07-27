package chapter2.c.sub3;

import org.junit.Assert;
import org.junit.Test;

public class MatrixMinMax {

    @Test
    public void testSmoothMatrix() {
        int[][] testArray = {{1,1},{1,1}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax == null);
    }

    @Test
    public void testSimpleMatrix0001() {
        int[][] testArray = {{0,0},{0,1}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax.equals(1));
    }

    @Test
    public void testSimpleMatrix0010() {
        int[][] testArray = {{0,0},{1,0}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax.equals(1));
    }

    @Test
    public void testSimpleMatrix0100() {
        int[][] testArray = {{0,1},{0,0}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax.equals(1));
    }

    @Test
    public void testSimpleMatrix1000() {
        int[][] testArray = {{1,0},{0,0}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax.equals(1));
    }

    @Test
    public void testTwoMaxMatrix() {
        int[][] testArray = {{1,0,1},{0,1,1},{1,2,1}};
        Integer minMax = Task3.findMinLocalMaximum(testArray);
        Assert.assertTrue(minMax.equals(2));
    }
}
