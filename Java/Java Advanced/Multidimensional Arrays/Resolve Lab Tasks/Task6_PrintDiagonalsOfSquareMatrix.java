import java.util.Arrays;
import java.util.Scanner;

public class Task6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int r = 0; r < matrix.length; r++) {
            int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[r] = nums;
        }

        for (int i = 0; i < matrix.length ; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[(matrix.length-1)-i][i] + " ");
        }
    }
}
