import java.util.Arrays;
import java.util.Scanner;

public class Task5_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] inputMatrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < inputMatrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            inputMatrix[i] = arr;
        }

        int[][] resultMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;


        for (int r = 0; r < inputMatrix.length - 1; r++) {
            for (int c = 0; c < inputMatrix[r].length - 1; c++) {
                int sum = inputMatrix[r][c] + inputMatrix[r][c + 1]
                        + inputMatrix[r + 1][c] + inputMatrix[r + 1][c + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    resultMatrix[0][0] = inputMatrix[r][c];
                    resultMatrix[0][1] = inputMatrix[r][c+1];
                    resultMatrix[1][0] = inputMatrix[r+1][c];
                    resultMatrix[1][1] = inputMatrix[r+1][c+1];
                }

            }
        }


        for (int r = 0; r < resultMatrix.length; r++) {
            for (int c = 0; c < resultMatrix[r].length; c++) {
                System.out.print(resultMatrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}
