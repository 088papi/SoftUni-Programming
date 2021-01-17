import java.util.Arrays;
import java.util.Scanner;

public class Task1_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] firstMatrix = new int[dimensions[0]][dimensions[1]];

        for (int r = 0; r < firstMatrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[r] = arr;
        }

        dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] secondMatrix = new int[dimensions[0]][dimensions[1]];

        for (int r = 0; r < secondMatrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[r] = arr;
        }

        boolean areEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                if (firstMatrix[i].length != secondMatrix[i].length) {
                    areEqual = false;
                    break;
                }

                for (int j = 0; j < firstMatrix[i].length; j++) {
                    if (firstMatrix[i][j] != secondMatrix[i][j]) {
                        areEqual = false;
                        break;
                    }
                    if (!areEqual) {
                        break;
                    }
                }
            }
        }


        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
