package chapter2.c.sub2;

import chapter2.c.sub1.Task1;
import org.junit.Assert;
import org.junit.Test;

public class Determinant {

    @Test
    public void testDiscrimSimple() {
        int[][] testArray = {{1,1},{1,1}};
        double determinant = Task2.determinant(testArray);
        Assert.assertEquals(0, Double.compare(0, determinant));
    }

    @Test
    public void testDiscrim() {
        int[][] testArray = {{2,1},{1,2}};
        double determinant = Task2.determinant(testArray);
        Assert.assertEquals(0, Double.compare(3, determinant));
    }

    @Test
    public void testDiscrim1() {
        int[][] testArray = {{2,1,2},{1,2,2},{3,2,2}};
        double determinant = Task2.determinant(testArray);
        Assert.assertEquals(0, Double.compare(-4, determinant));
    }

    @Test
    public void testDiscrimHard() {
        int[][] testArray = {{-2,1,3,2},{3,0,-1,2},{-5,2,3,0},{4,-1,2,-3}};
        double determinant = Task2.determinant(testArray);
        Assert.assertEquals(0, Double.compare(-80, determinant));
    }
}
