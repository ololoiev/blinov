package chapter1.a.sub3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NOKandNOD {

    private int[][][] testArrays = {
            {{1}, {1, 1}},
            {{8}, {8, 8}},
            {{1,2}, {2, 1}},
            {{2, 4}, {4, 2}},
            {{4, 4}, {4, 4}},
            {{4, 2}, {4, 2}},
            {{4, 4, 2, 4}, {4, 2}},
            {{6, 3, 9, 3}, {18, 3}},
            {{13, 17}, {221, 1}}
    };

    @Test
    public void testNok() {
        for (int[][] testArray : testArrays) {
            Assert.assertEquals(testArray[1][0], nok(testArray[0]));
        }
    }

    public int nok(int ... values) {

        return findNumbersComponents(values).stream().reduce(1, (a, b) -> a*b);
    }


    private ArrayList<Integer> findNumbersComponents(int[] input) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int anInput : input) {
            int decomposingNumber = anInput;

            decomposingNumber = simplifyMultipliersAndNumber(output, decomposingNumber);

            if (decomposingNumber != 1) {
                output.add(decomposingNumber);
            }
        }
        return output;
    }

    private int simplifyMultipliersAndNumber(ArrayList<Integer> output, int decomposingNumber) {
        for (int i = 0; i < output.size(); i++) {
            int simpleMultiplier = output.get(i);

            if (simpleMultiplier % decomposingNumber == 0 && simpleMultiplier / decomposingNumber != 1) {
                output.set(i, simpleMultiplier / decomposingNumber);
            } else if (decomposingNumber % simpleMultiplier == 0) {
                decomposingNumber /= simpleMultiplier;
            }
        }

        return decomposingNumber;
    }


    @Test
    public void testNod() {
        for (int[][] testArray : testArrays) {
            Assert.assertEquals(testArray[1][1], nod(testArray[0]));
        }

    }

    public int nod(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(numbers[0], (nod, newNumber) -> {
                    int result = nod * newNumber / nok(nod, newNumber);
                    return nod <= result ? nod : result;
                });
    }
}
