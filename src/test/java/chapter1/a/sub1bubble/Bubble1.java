package chapter1.a.sub1bubble;

import org.junit.Assert;
import org.junit.Test;

public class Bubble1 {

    private int[][][] testArrays = {{{1}, {1}}, {{1, 2}, {2, 1}}, {{-1, -2}, {-2, -1}}};

    @Test
    public void test(){
        for (int[][] testArray : testArrays) {
            Assert.assertArrayEquals(testArray[1], sort(testArray[0]));
        }
    }

    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if(Math.abs(numbers[i]) < Math.abs(numbers[i + 1])){
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        return numbers;
    }
}
