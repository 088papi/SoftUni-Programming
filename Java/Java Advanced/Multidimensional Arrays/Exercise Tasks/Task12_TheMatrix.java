import java.util.Arrays;
import java.util.Scanner;

public class Task12_TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner);
        char[][] matrix = new char[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
          String line = scanner.nextLine();
          matrix[i] = line.replaceAll("\\s+", "").toCharArray();

        }

        char fillChar = scanner.nextLine().charAt(0);

        int[] startRowAndCol = readArray(scanner);
        int startRow = startRowAndCol[0];
        int startCol = startRowAndCol[1];

        char startChar = matrix[startRow][startCol];
        fillMatrix(startRow, startCol, fillChar, startChar, matrix);


        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int startRow, int startCol, char fillChar, char startChar, char[][] matrix) {

        if (matrix[startRow][startCol] != startChar) {
            return;
        }

        matrix[startRow][startCol] = fillChar;
        if (startRow - 1 >= 0) {
            fillMatrix(startRow - 1, startCol, fillChar, startChar, matrix);
        }
        if (startRow + 1 < matrix.length) {
            fillMatrix(startRow + 1, startCol, fillChar, startChar, matrix);
        }
        if (startCol - 1 >= 0) {
            fillMatrix(startRow, startCol - 1, fillChar, startChar, matrix);
        }
        if (startCol + 1 < matrix[startRow].length) {
            fillMatrix(startRow, startCol + 1, fillChar, startChar, matrix);
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
