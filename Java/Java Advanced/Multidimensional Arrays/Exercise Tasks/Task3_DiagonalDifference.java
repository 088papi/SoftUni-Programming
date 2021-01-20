import java.util.Arrays;
import java.util.Scanner;

public class Task3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int dimensions = Integer.parseInt(scanner.nextLine());
        
        int[][] matrix = new int[dimensions][dimensions];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        
       
        System.out.println(Math.abs(findSumLeftToRight(matrix) - findSumRightToLeft(matrix)));
        
        
    }

    private static int findSumRightToLeft(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i <  matrix.length; i++) {
            sum+= matrix[i][i];
        }
        
        
        return sum;
    }

    private static int findSumLeftToRight(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+= matrix[(matrix.length-1)-i][i];
        }
        return sum; 
    }
}
