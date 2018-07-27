package chapter2.c.sub3;

public class Task3 {

    public static Integer findMinLocalMaximum(int[][] matrix) {
        int minMax = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int value = matrix[i][j];
                int rightValue = j < row.length - 1 ? matrix[i][j + 1] : Integer.MIN_VALUE;
                int leftValue = j < 1 ? Integer.MIN_VALUE : matrix[i][j - 1];
                int upValue = i < matrix.length - 1 ? matrix[i + 1][j] : Integer.MIN_VALUE;
                int downValue = i < 1 ? Integer.MIN_VALUE : matrix[i - 1][j];
                if (value > rightValue && value > leftValue && value > upValue && value > downValue) {
                    if (minMax < value) {
                        minMax = value;
                    }
                }
            }
        }
        return minMax == Integer.MIN_VALUE ? null : minMax;
    }
}
