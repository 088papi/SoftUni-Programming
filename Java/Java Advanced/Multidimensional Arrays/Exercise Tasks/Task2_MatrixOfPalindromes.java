import java.util.Arrays;
import java.util.Scanner;

public class Task2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readIntegerArray(scanner);

        char[][] matrix = new char[dimensions[0]][dimensions[1]];
        char a = 'a';
        char b = 'a';
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length ; cols++) {

                System.out.printf("%s%s%s ", a,b,a);
                b++;
            }
            System.out.println();
            a++;
            b = a;
        }

    }

    private static int[] readIntegerArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }


}
