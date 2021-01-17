import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task8_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] inputIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wrongValue = matrix[inputIndexes[0]][inputIndexes[1]];


        List<int[]> indexes = new ArrayList<>();
        List<Integer> correctValues = new ArrayList<>();


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    indexes.add(new int[]{r, c});
                    correctValues.add(getCorrectValue(matrix, r, c));

                }
            }
        }
            for (int i = 0; i < indexes.size(); i++) {
             int[] rowAndCol = indexes.get(i);
                matrix[rowAndCol[0]][rowAndCol[1]] = correctValues.get(i);
            }

        for (int r = 0; r < matrix.length ; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

    }

    private static Integer getCorrectValue(int[][] matrix, int r, int c) {

        int sum = 0;
        int wrongValue = matrix[r][c];

        if (isInBounds(matrix, r - 1, c) && wrongValue != matrix[r - 1][c]) {
            sum += matrix[r - 1][c];
        }
        if ((isInBounds(matrix, r + 1, c) && wrongValue != matrix[r + 1][c])) {
            sum += matrix[r + 1][c];
        }
        if ((isInBounds(matrix, r, c - 1) && wrongValue != matrix[r][c - 1])) {
            sum += matrix[r][c - 1];
        }
        if ((isInBounds(matrix, r, c + 1) && wrongValue != matrix[r][c + 1])) {
            sum += matrix[r][c + 1];
        }


        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }


}