package task2;

import java.util.Scanner;

public class Task2_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = scanner.nextLine().split("");
        }

        boolean isFound = false;
        int snakeRow = 0;
        int snakeCol = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j].equals("S")) {
                    isFound = true;
                    snakeRow = i;
                    snakeCol = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }


        int foodQuantity = 0;


        boolean isOutOfBounds = false;

        while (foodQuantity < 10) {

            String command = scanner.nextLine();
            matrix[snakeRow][snakeCol] = ".";


            int[] indexesAndFood = new int[3];

            switch (command) {
                case "up":
                    snakeRow--;
                    if (!isOutOfBounds(snakeRow, snakeCol, matrix)) {

                        indexesAndFood = checkMatrix(matrix, snakeRow, snakeCol);
                        foodQuantity += indexesAndFood[0];

                    } else {
                        isOutOfBounds = true;
                    }
                    break;
                case "down":
                    snakeRow++;
                    if (!isOutOfBounds(snakeRow, snakeCol, matrix)) {
                        indexesAndFood = checkMatrix(matrix, snakeRow, snakeCol);
                        foodQuantity += indexesAndFood[0];

                    } else {
                        isOutOfBounds = true;
                    }
                    break;
                case "left":
                    snakeCol--;
                    if (!isOutOfBounds(snakeRow, snakeCol, matrix)) {
                        indexesAndFood = checkMatrix(matrix, snakeRow, snakeCol);
                        foodQuantity += indexesAndFood[0];

                    } else {
                        isOutOfBounds = true;
                    }
                    break;
                case "right":
                    snakeCol++;
                    if (!isOutOfBounds(snakeRow, snakeCol, matrix)) {
                        indexesAndFood = checkMatrix(matrix, snakeRow, snakeCol);
                        foodQuantity += indexesAndFood[0];

                    } else {
                        isOutOfBounds = true;
                    }
                    break;
            }

            snakeRow = indexesAndFood[1];
            snakeCol = indexesAndFood[2];

            if (isOutOfBounds) {
                break;
            }


        }

        if (foodQuantity >= 10) {
            System.out.println("You won! You fed the snake.");
        } else {
            System.out.println("Game over!");
        }
        System.out.printf("Food eaten: %d%n", foodQuantity);
        printMatrix(matrix);

    }


    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] checkMatrix(String[][] matrix, int snakeRow, int snakeCol) {
        int foundTreats = 0;

        int firstBRow = 0;
        int firstBCol = 0;

        int secondBRow = 0;
        int secondBCol = 0;

        if (matrix[snakeRow][snakeCol].equals("*")) {
            foundTreats++;
        } else if (matrix[snakeRow][snakeCol].equals("B")) {


            int[] first = getFirstBIndexes(matrix);
            firstBRow = first[0];
            firstBCol = first[1];


            int[] second = getSecondBIndexes(matrix);
            secondBRow = second[0];
            secondBCol = second[1];

            matrix[snakeRow][snakeCol] = ".";

            if (snakeRow == firstBRow && snakeCol == firstBCol) {
                snakeRow = secondBRow;
                snakeCol = secondBCol;
            } else if (snakeRow == secondBRow && snakeCol == secondBCol) {
                snakeRow = firstBRow;
                snakeCol = firstBCol;
            }


        }
        matrix[snakeRow][snakeCol] = "S";

        return new int[]{foundTreats, snakeRow, snakeCol};
    }

    public static int[] getFirstBIndexes(String[][] matrix) {
        boolean isFound = false;

        int[] rowAndCol = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")) {
                    rowAndCol[0] = i;
                    rowAndCol[1] = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        return rowAndCol;
    }

    public static int[] getSecondBIndexes(String[][] matrix) {
        boolean isFound = false;

        int[] rowAndCol = new int[2];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[i][j].equals("B")) {
                    rowAndCol[0] = i;
                    rowAndCol[1] = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return rowAndCol;
    }

    public static boolean isOutOfBounds(int row, int col, String[][] matrix) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix.length) {
            return false;
        }

        return true;
    }
}
