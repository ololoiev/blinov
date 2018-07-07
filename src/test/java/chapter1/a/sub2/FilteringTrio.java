package chapter1.a.sub2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FilteringTrio {

    private int[][][] testArrays = {
            {{1}, {}},
            {{123}, {123}},
            {{111}, {}},
            {{121}, {}},
            {{112}, {}},
            {{211}, {}},
            {{102, 987, 456, 555, 654}, {102, 987, 456, 654}}
    };

    @Test
    public void test(){
        for (int[][] testArray : testArrays) {
            Assert.assertArrayEquals(testArray[1], filter(testArray[0]));
        }
    }

    public int[] filter(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(v -> v > 99 && v < 1000)
//                .filter(v -> v/100 != v/10-(v/100)*10)
//                .filter(v -> v/100 != v - (v/100)*100 - (v/10 - (v/100)*10)*10)
//                .filter(v -> v - (v/100)*100 - (v/10 - (v/100)*10)*10 != v/10-(v/100)*10)
                .filter(v -> v/100 != v%10)
                .filter(v -> v/100 != v%100/10)
                .filter(v -> v%100/10 != v%10)
                .toArray();
    }
}
