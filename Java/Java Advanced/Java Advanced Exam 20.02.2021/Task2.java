import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");

        String[][] matrix = new String[size][size];

        readStringMatrix(scanner, matrix);
        int[] currentPosition = findCurrentPosition(matrix);
        int currentRow = currentPosition[0];
        int currentCol = currentPosition[1];

        boolean foundEndOfRoute = false;
        int startBombCount = findBombs(matrix);
        for (int i = 0; i < commands.length; i++) {

            matrix[currentRow][currentCol] = "+";

            switch (commands[i]) {
                case "up":
                    currentRow--;
                    if (!isInBounds(matrix,currentRow,currentCol)){
                        currentRow++;
                    }
                    break;
                case "down":
                    currentRow++;
                    if (!isInBounds(matrix,currentRow,currentCol)){
                        currentRow--;
                    }
                    break;
                case "left":
                    currentCol--;
                    if (!isInBounds(matrix,currentRow,currentCol)){
                        currentCol++;
                    }
                    break;
                case "right":
                    currentCol++;
                    if (!isInBounds(matrix,currentRow,currentCol)){
                        currentCol--;
                    }
                    break;
            }


            startBombCount-= checkForBombs(matrix, currentRow,currentCol);
            if (startBombCount == 0){
                break;
            } else if (matrix[currentRow][currentCol].equals("e")){
                foundEndOfRoute = true;
                break;
            } else {
                matrix[currentRow][currentCol] = "s";
            }

        }

        if (foundEndOfRoute){
            System.out.printf("END! %d bombs left on the field%n", startBombCount);
        } else if (startBombCount == 0){
            System.out.println("Congratulations! You found all bombs!");
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)%n", startBombCount
            , currentRow,currentCol);
        }





    }

    private static boolean isInBounds(String[][] matrix, int currentRow, int currentCol) {
        return currentRow >= 0 && currentRow < matrix.length && currentCol >= 0 && currentCol < matrix.length;
    }

    private static int checkForBombs(String[][] matrix, int currentRow, int currentCol) {
        int bombsFound = 0;

            if (matrix[currentRow][currentCol].equals("B")){
                bombsFound++;
                System.out.println("You found a bomb!");
            }



        return bombsFound;
    }

    private static int findBombs(String[][] matrix) {
        int bombs = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")) {
                    bombs++;
                }
            }


        }
        return bombs;
    }

    private static int[] findCurrentPosition(String[][] matrix) {
        int currentRow = 0;
        int currentCol = 0;

        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("s")) {
                    currentRow = i;
                    currentCol = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        return new int[]{currentRow, currentCol};
    }

    private static void readStringMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
    }
}
