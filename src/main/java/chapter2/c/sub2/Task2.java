package chapter2.c.sub2;

public class Task2 {

    public static double determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }

        double determinant = 0;
        for (int j = 0; j < matrix.length; j++){
            if (j % 2 == 0) {
                determinant += matrix[0][j] * determinant(exclude(0, j, matrix));
            }else {
                determinant -= matrix[0][j] * determinant(exclude(0, j, matrix));
            }
        }
        return determinant;
    }

    private static int[][] exclude(final int i, final int j, int[][] matrix) {
        int[][] subMatrix = new int[matrix.length-1][matrix[0].length-1];
        for (int i1 = 0; i1 < matrix.length; i1++) {
            if (i1 != i) {
                int[] row = matrix[i1];
                for (int j1 = 0; j1 < row.length; j1++) {
                    if (j1 != j) {
                        subMatrix[i1 <= i ? i1 : i1 - 1][j1 <= j ? j1 : j1 - 1] = matrix[i1][j1];
                    }
                }
            }
        }
        return subMatrix;
    }
}
