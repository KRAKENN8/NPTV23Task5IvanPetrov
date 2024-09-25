import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] massiv = new int[5][];
        massiv[0] = new int[3];
        massiv[1] = new int[5];
        massiv[2] = new int[7];
        massiv[3] = new int[8];
        massiv[4] = new int[9];

        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(51) + 50;
            }
        }

        System.out.println("Несортированный массив:");
        for (int[] row : massiv) {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i < massiv.length; i++) {
            Arrays.sort(massiv[i]);
        }

        System.out.println("Отсортированный массив:");
        for (int[] row : massiv) {
            System.out.println(Arrays.toString(row));
        }
    }
}
