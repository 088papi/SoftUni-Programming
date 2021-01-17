import java.util.Scanner;

public class Task3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];

        for (int r = 0; r < firstMatrix.length; r++) {
            String[] arr = scanner.nextLine().split(" ");
            firstMatrix[r] = arr;
        }

        String[][] secondMatrix = new String[rows][cols];
        for (int r = 0; r < secondMatrix.length; r++) {
            String[] arr = scanner.nextLine().split(" ");
            secondMatrix[r] = arr;
        }

        String[][] thirdMatrix = new String[rows][cols];

        for (int r = 0; r < firstMatrix.length ; r++) {
            for (int c = 0; c < firstMatrix[r].length; c++) {
                if (firstMatrix[r][c].equals(secondMatrix[r][c])){
                    thirdMatrix[r][c] = firstMatrix[r][c];
                } else {
                    thirdMatrix[r][c] = "*";
                }
            }
        }

        for (int r = 0; r < thirdMatrix.length; r++) {
            for (int c = 0; c < thirdMatrix[r].length ; c++) {
                System.out.print(thirdMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
