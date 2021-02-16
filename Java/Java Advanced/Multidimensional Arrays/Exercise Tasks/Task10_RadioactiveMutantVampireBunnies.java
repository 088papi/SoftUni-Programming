import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task10_RadioactiveMutantVampireBunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = new String[dimensions[0]][dimensions[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("");
        }

        int[] playerRowAndCol = findPlayer(matrix);
        int playerRow = playerRowAndCol[0];
        int playerCol = playerRowAndCol[1];

        char[] commands = scanner.nextLine().toCharArray();

        boolean isDead = false;


        for (char currentCommand : commands) {

            matrix[playerRow][playerCol] = ".";

            switch (currentCommand) {
                case 'U':
                    playerRow--;
                    move(matrix, playerRow, playerCol);
                    break;
                case 'D':
                    playerRow++;
                    move(matrix, playerRow, playerCol);
                    break;
                case 'L':
                    playerCol--;
                    move(matrix, playerRow, playerCol);
                    break;
                case 'R':
                    playerCol++;
                    move(matrix, playerRow, playerCol);
                    break;
            }


            List<int[]> bunnies = findBunnies(matrix);
            spreadBunnies(matrix, bunnies);


            if (isOutOfBounds(matrix, playerRow, playerCol)) {
                if (playerRow < 0) {
                    playerRow = 0;
                }
                if (playerCol < 0) {
                    playerCol = 0;
                }

                if (playerRow > matrix.length - 1) {
                    playerRow = matrix.length - 1;
                }
                if (playerCol > matrix[playerRow].length - 1) {
                    playerCol = matrix[playerRow].length - 1;
                }
                break;
            } else if (matrix[playerRow][playerCol].equals("B")) {
                isDead = true;
                break;
            }

        }


        printMatrix(matrix);
        if (isDead) {
            System.out.print("dead: ");
        } else {
            System.out.print("won: ");
        }
        System.out.print(playerRow + " " + playerCol);
    }

    private static int[] findPlayer(String[][] matrix) {
        boolean isFound = false;
        int playerRow = 0;
        int playerCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    playerRow = i;
                    playerCol = j;
                    isFound = true;
                }
            }
            if (isFound) {
                break;
            }
        }
        return new int[]{playerRow, playerCol};
    }

    private static List<int[]> findBunnies(String[][] matrix) {
        List<int[]> bunnies = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")) {
                    bunnies.add(new int[]{i, j});
                }
            }
        }
        return bunnies;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isOutOfBounds(String[][] matrix, int playerRow, int playerCol) {
        return !(playerRow >= 0 && playerRow < matrix.length && playerCol >= 0 && playerCol < matrix[playerRow].length);
    }

    private static void spreadBunnies(String[][] matrix, List<int[]> bunnies) {
        for (int[] bunny : bunnies) {
            int row = bunny[0];
            int col = bunny[1];

            if (!isOutOfBounds(matrix, row - 1, col)) {
                matrix[row - 1][col] = "B";
            }
            if (!isOutOfBounds(matrix, row + 1, col)) {
                matrix[row + 1][col] = "B";
            }
            if (!isOutOfBounds(matrix, row, col - 1)) {
                matrix[row][col - 1] = "B";
            }
            if (!isOutOfBounds(matrix, row, col + 1)) {
                matrix[row][col + 1] = "B";
            }


        }

    }

    private static void move(String[][] matrix, int playerRow, int playerCol) {
        if (!isOutOfBounds(matrix, playerRow, playerCol)) {
            if (!matrix[playerRow][playerCol].equals("B")) {
                matrix[playerRow][playerCol] = "P";
            }

        }
    }


}

