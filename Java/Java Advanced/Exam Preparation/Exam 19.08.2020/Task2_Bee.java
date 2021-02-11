import java.util.Scanner;

public class Task2_Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

       String[][] matrix = new String[size][size];

        readSquareMatrix(scanner, size, matrix);

        int beeRow = 0;
        int beeCol = 0;
        boolean isFound = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j].equals("B")){
                    beeRow = i;
                    beeCol = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }

        int pollinatedFlowers = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")){

                matrix[beeRow][beeCol] = ".";

                switch (command) {
                    case "up":
                        beeRow--;
                        break;
                    case "down":
                        beeRow++;
                        break;
                    case "left":
                        beeCol--;
                        break;
                    case "right":
                        beeCol++;
                        break;
                }

                if (!isInBounds(beeRow,beeCol,matrix)){
                    break;
                }
                if (matrix[beeRow][beeCol].equals("f")) {
                    pollinatedFlowers++;
                } else if (matrix[beeRow][beeCol].equals("O")) {
                    continue;
                }


                matrix[beeRow][beeCol] = "B";
            command = scanner.nextLine();
        }


        if (!isInBounds(beeRow, beeCol,matrix)){
            System.out.println("The bee got lost!");
        }
        if (pollinatedFlowers < 5){
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        }

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

    private static int pollinate(String[][] matrix, int beeRow, int beeCol) {
        int flowers = 0;





        return flowers;
    }

    private static void readSquareMatrix(Scanner scanner, int size, String[][] matrix) {
        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    private static boolean isInBounds(int row, int col, String[][] matrix){
    return row >= 0 && row < matrix.length && col >= 0 && col < matrix.length;
    }
}
