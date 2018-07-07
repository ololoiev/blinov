import java.util.Random;

public class Generator {
    public int[] generate(int n) {
        int[] numbers = new int[n];
        Random random = new Random(123);
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(i);
        }
        return numbers;
    }
}
