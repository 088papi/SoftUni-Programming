import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotation = scanner.nextLine().split("[()]");
        int angle = Integer.parseInt(rotation[1]) % 360;

        String inputWord = scanner.nextLine();
        int maxLength = 0;
        List<String> words = new ArrayList<>();
        while (!inputWord.equals("END")) {
            if (maxLength < inputWord.length()) {
                maxLength = inputWord.length();
            }
            words.add(inputWord);

            inputWord = scanner.nextLine();
        }

        int rows = words.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c < words.get(r).length()) {
                    matrix[r][c] = words.get(r).charAt(c);
                } else {
                    matrix[r][c] = ' ';
                }
            }
        }
        rotateAndPrintMatrix(angle, rows, cols, matrix);


    }

    private static void rotateAndPrintMatrix(int angle, int rows, int cols, char[][] matrix) {
        if (angle == 90) {

            for (int c = 0; c < cols; c++) {
                for (int r = rows - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (angle == 180) {
            for (int r = rows -1; r >= 0 ; r--) {
                for (int c = cols -1; c >= 0 ; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }



        } else if (angle == 270) {
            for (int col = cols - 1; col >= 0 ; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angle == 0) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }
    }
}

