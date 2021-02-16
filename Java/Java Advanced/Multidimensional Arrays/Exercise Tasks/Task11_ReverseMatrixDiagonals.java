import java.util.Arrays;
import java.util.Scanner;

public class Task11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readIntegerArray(scanner);

        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i <matrix.length ; i++) {
            matrix[i] = readIntegerArray(scanner);
        }

        int row = dimensions[0]-1;
        int col = dimensions[1] -1;

        while (row >= 0){

            int innerRow = row;
            int innerCol = col;

            while (innerCol < dimensions[1] && innerRow >= 0){
                System.out.print(matrix[innerRow--][innerCol++] + " ");
            }
            System.out.println();

            col--;
            if (col < 0){
                col = 0;
                row--;
            }


        }

    }

    private static int[] readIntegerArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
