import java.util.Scanner;

public class Task1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[dimensions][dimensions];

        if (type.equals("A")){
            fillMatrixTypeA(matrix);

        }else if (type.equals("B")){
            fillMatrixTypeB(matrix);
        } 

        printMatrix(matrix);



    }
    public static void fillMatrixTypeA(int[][] matrix){
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[j][i] = number++;
            }
        }
        }

    public static void fillMatrixTypeB(int[][] matrix){
       int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 ==0){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = number++;
                }
            } else {
                for (int j = matrix.length-1; j >=0 ; j--) {
                    matrix[j][i] = number++;
                }
            }

            }
    }

    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }

}
