import java.util.Arrays;
import java.util.Scanner;

public class Task5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = new String[dimensions[0]][dimensions[1]];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (input.startsWith("swap")) {
                String[] data = input.split("\\s+");
                if (data.length > 5) {
                    System.out.println("Invalid input!");
                } else {

                    int row1 = Integer.parseInt(data[1]);
                    int col1 = Integer.parseInt(data[2]);
                    int row2 = Integer.parseInt(data[3]);
                    int col2 = Integer.parseInt(data[4]);

                    if (row1 > matrix.length || col1 > matrix[row1].length
                            || row2 > matrix.length || col2 > matrix[row2].length) {
                        System.out.println("Invalid input!");
                    } else {

                        String temp = matrix[row1][col1];
                        matrix[row1][col1] = matrix[row2][col2];
                        matrix[row2][col2] = temp;
                        printStringMatrix(matrix);
                    }


                }
            } else {
                System.out.println("Invalid input!");
            }


            input = scanner.nextLine();
        }


    }

    private static void printStringMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
