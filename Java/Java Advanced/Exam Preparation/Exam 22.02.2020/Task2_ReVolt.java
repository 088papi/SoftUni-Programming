package Task2;

import java.util.Scanner;

public class Task2_ReVolt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int commandNumber = Integer.parseInt(scanner.nextLine());

        String[][] field = new String[size][size];

        for (int row = 0; row < size; row++) {
            field[row] = scanner.nextLine().split("");
        }
        int currentRow = 0;
        int currentCol = 0;
        boolean isFound = false;
        boolean hasLost = false;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (field[row][col].equals("f")) {
                    currentRow = row;
                    currentCol = col;
                    isFound = true;
                    break;
                }

            }
            if (isFound) {
                break;
            }
        }


        field[currentRow][currentCol] = "-";
        String command = scanner.nextLine();
        for (int i = 1; i <= commandNumber; i++) {


            int prevRow = currentRow;
            int prevCol = currentCol;


            switch (command) {
                case "up":
                    currentRow--;
                    if (currentRow < 0) {
                        currentRow = field.length - 1;
                    }
                    break;
                case "down":
                    currentRow++;
                    if (currentRow > field.length - 1) {
                        currentRow = 0;
                    }
                    break;
                case "left":
                    currentCol--;
                    if (currentCol < 0) {
                        currentCol = field.length - 1;
                    }
                    break;
                case "right":
                    currentCol++;
                    if (currentCol > field.length - 1) {
                        currentCol = 0;
                    }
                    break;
            }

            String player = field[currentRow][currentCol];

            if (player.equals("F")) {

                System.out.println("Player won!");
                printField(field,currentRow,currentCol);
                return;
            } else if (player.equals("T")) {

                currentRow = prevRow;
                currentCol = prevCol;
                player = field[currentRow][currentCol];

            } else if (player.equals("B")){
                i--;
                continue;
            }

            if (i == commandNumber){
                break;
            }
            command = scanner.nextLine();
        }



            System.out.println("Player lost!");
            printField(field,currentRow,currentCol);
        }



    private static void printField(String[][] matrix,int currentRow, int currentCol){
        matrix[currentRow][currentCol] = "f";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    private static void printPlayerWon(String[][] field, int currentRow, int currentCol) {
        System.out.println("Player won!");
        field[currentRow][currentCol] = "f";
    }
}
