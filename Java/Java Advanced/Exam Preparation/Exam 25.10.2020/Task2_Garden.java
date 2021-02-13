import java.util.Arrays;
import java.util.Scanner;

public class Task2_Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readIntArray(scanner);

        int[][] garden = new int[dimensions[0]][dimensions[1]];

        for (int[] ints : garden) {
            Arrays.fill(ints, 0);
        }


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Bloom Bloom Plow")) {
                break;
            }
            int[] flowerIndexes = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            int row = flowerIndexes[0];
            int col = flowerIndexes[1];
            if (!isInBounds(garden, row, col)) {
                System.out.println("Invalid coordinates.");
                continue;
            }

            garden[row][col] = 1;
            fillUp(garden,row,col);
            fillDown(garden,row,col);
            fillLeft(garden,row,col);
            fillRight(garden,row,col);
        }

        
        
        printMatrix(garden);
    }

    private static void fillRight(int[][] garden, int row, int col) {
        for (int i = col + 1; i < garden.length; i++) {
            garden[row][i]+=1;
        }
    }

    private static void fillLeft(int[][] garden, int row, int col) {
        for (int i = col -1; i >= 0 ; i--) {
            garden[row][i] +=1;
        }
    }

    private static void fillDown(int[][] garden, int row, int col) {
        for (int i = row + 1; i < garden.length ; i++) {
            garden[i][col] +=1;
        }
    }

    private static void fillUp(int[][] garden, int row, int col) {
        for (int i = row - 1; i >= 0 ; i--) {
            garden[i][col] +=1;
        }
    }


    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix.length;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
