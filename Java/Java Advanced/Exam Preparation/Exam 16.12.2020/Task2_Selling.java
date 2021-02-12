import java.util.Scanner;

public class Task2_Selling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int currentRow = 0;
        int currentCol = 0;

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("S")) {
                currentRow = i;
                currentCol = line.indexOf("S");
            }
        }

        int money = 0;

        boolean isOutOfBounds = false;
        while (money < 50) {
            String command = scanner.nextLine();
            matrix[currentRow][currentCol] = '-';
            int[] indexesAndMoney = new int[3];

            switch (command) {
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
            }

            if (!isInBounds(matrix, currentRow, currentCol)) {
                isOutOfBounds = true;
                break;
            }
            indexesAndMoney = checkForMoney(matrix, currentRow, currentCol);
            money += indexesAndMoney[0];
            currentRow = indexesAndMoney[1];
            currentCol = indexesAndMoney[2];

            matrix[currentRow][currentCol] = 'S';

        }

        if (isOutOfBounds){
            System.out.println("Bad news, you are out of the bakery.");
        }if (money >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.println("Money: " + money);
        printMatrix(matrix);


    }

    private static int[] checkForMoney(char[][] matrix, int currentRow, int currentCol) {
        int money = 0;


        int[] firstRowAndCol = findFirstIndexes(matrix);
        int firstORow = firstRowAndCol[0];
        int firstOCol = firstRowAndCol[1];

        int[] lastRowAndCol = findLastIndexes(matrix);
        int lastORow = lastRowAndCol[0];
        int lastOCol = lastRowAndCol[1];


        if (Character.isDigit(matrix[currentRow][currentCol])) {
            money += Integer.parseInt(String.valueOf(matrix[currentRow][currentCol]));
        } else if (String.valueOf(matrix[currentRow][currentCol]).equals("O")) {
            matrix[currentRow][currentCol] = '-';
            if (currentRow == firstORow && currentCol == firstOCol){
                currentRow = lastORow;
                currentCol = lastOCol;
            } else if (currentRow == lastORow && currentCol == lastOCol){
                currentRow = firstORow;
                currentCol = firstOCol;
            }
        }


        matrix[currentRow][currentCol] = 'S';
        return new int[]{money, currentRow,currentCol};
    }

    private static int[] findLastIndexes(char[][] matrix) {

        int secondORow = 0;
        int secondOCol = 0;
        boolean isFound = false;

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int length = matrix[i].length-1; length >= 0; length--) {
                if (String.valueOf(matrix[i][length]).equals("O")) {
                    secondORow = i;
                    secondOCol = length;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return new int[]{secondORow, secondOCol};
    }


    private static int[] findFirstIndexes(char[][] matrix){

        int firstORow = 0;
        int firstOCol = 0;
        boolean isFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (String.valueOf(matrix[i][j]).equals("O")) {
                    firstORow = i;
                    firstOCol = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return new int[]{firstORow, firstOCol};
    }
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


    private static boolean isInBounds(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix.length;
    }
}
