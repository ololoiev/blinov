package chapter2.c.sub1;

public class Task1 {

    public static double norm(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                sum += Math.pow(row[j], 2);
            }
        }
        return Math.sqrt(Math.abs(sum));
    }
}
