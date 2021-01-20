import java.util.Arrays;
import java.util.Scanner;

public class Task4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readIntegerArray(scanner);
        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        readIntegerMatrix(scanner, matrix);
        int maxSum = Integer.MIN_VALUE;
        int[][] bestSumMatrix = new int[3][3];

        maxSum = getMaxSum(matrix, maxSum, bestSumMatrix);
        System.out.println("Sum = " + maxSum);
        printIntegerArray(bestSumMatrix);
    }

    private static void readIntegerMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readIntegerArray(scanner);
        }
    }

    private static int getMaxSum(int[][] matrix, int maxSum, int[][] bestSumMatrix) {
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {

                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;

                    bestSumMatrix[0][0] = matrix[i][j];
                    bestSumMatrix[0][1] = matrix[i][j + 1];
                    bestSumMatrix[0][2] = matrix[i][j + 2];

                    bestSumMatrix[1][0] = matrix[i + 1][j];
                    bestSumMatrix[1][1] = matrix[i + 1][j + 1];
                    bestSumMatrix[1][2] = matrix[i + 1][j + 2];

                    bestSumMatrix[2][0] = matrix[i + 2][j];
                    bestSumMatrix[2][1] = matrix[i + 2][j + 1];
                    bestSumMatrix[2][2] = matrix[i + 2][j + 2];


                }
            }
        }
        return maxSum;
    }

    private static void printIntegerArray(int[][] bestSumMatrix) {
        for (int i = 0; i < bestSumMatrix.length; i++) {
            for (int j = 0; j < bestSumMatrix[i].length; j++) {
                System.out.print(bestSumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] readIntegerArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
