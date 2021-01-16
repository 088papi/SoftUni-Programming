import java.util.Arrays;
import java.util.Scanner;

public class Task4_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = readMatrix(scanner, ", ");

        int sum = 0;

        for (int[] arr : matrix) {
            for (int number : arr) {
                sum += number;
            } //може да намериш сумата със stream
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }

    private static int[][] readMatrix(Scanner scanner, String pattern) {

        int[] rowsAndCols = readArray(scanner, pattern);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner, pattern);
        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
