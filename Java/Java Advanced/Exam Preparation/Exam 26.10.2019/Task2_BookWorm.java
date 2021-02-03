package Task2;

import java.util.Scanner;

public class Task2_BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialString = scanner.nextLine();

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().split("");
        }

        int currentRowP = 0;
        int currentColP = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("P")) {
                    currentRowP = row;
                    currentColP = col;
                    break;
                }
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("end")) {


            switch (input) {
                case "up":
                    if (currentRowP - 1 >= 0) {

                        matrix[currentRowP][currentColP] = "-";


                        if (Character.isLetter(matrix[currentRowP - 1][currentColP].charAt(0))) {
                            initialString += matrix[currentRowP - 1][currentColP];

                        }
                        matrix[currentRowP - 1][currentColP] = "P";
                        currentRowP = currentRowP - 1;

                    } else {
                        initialString = appendToInitialString(initialString);
                    }
                    break;
                case "down":
                    if (currentRowP + 1 <= size - 1) {

                        matrix[currentRowP][currentColP] = "-";

                        if (Character.isLetter(matrix[currentRowP + 1][currentColP].charAt(0))) {
                            initialString += matrix[currentRowP + 1][currentColP];

                        }
                        matrix[currentRowP + 1][currentColP] = "P";
                        currentRowP = currentRowP + 1;


                    } else {
                        initialString = appendToInitialString(initialString);
                    }
                    break;
                case "left":
                    if (currentColP - 1 >= 0) {

                        matrix[currentRowP][currentColP] = "-";

                        if (Character.isLetter(matrix[currentRowP][currentColP - 1].charAt(0))) {
                            initialString += matrix[currentRowP][currentColP - 1];

                        }
                        matrix[currentRowP][currentColP - 1] = "P";

                        currentColP = currentColP - 1;


                    } else {
                        initialString = appendToInitialString(initialString);
                    }
                    break;
                case "right":
                    if (currentColP + 1 <= size - 1) {

                        matrix[currentRowP][currentColP] = "-";


                        if (Character.isLetter(matrix[currentRowP][currentColP + 1].charAt(0))) {
                            initialString += matrix[currentRowP][currentColP + 1];
                        }

                        matrix[currentRowP][currentColP + 1] = "P";

                        currentColP = currentColP + 1;

                    } else {
                        initialString = appendToInitialString(initialString);
                    }
                    break;
            }

            input = scanner.nextLine();

        }

        System.out.println(initialString);

        printStringMatrix(matrix);
    }

    private static String appendToInitialString(String initialString) {
        initialString = initialString.substring(0, initialString.length() - 1);
        return initialString;
    }

    private static void printStringMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}


