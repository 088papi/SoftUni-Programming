import java.util.Scanner;

//100/100
public class Task3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLineLength = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxLineLength; i++) {
            printLineOfNumbersIncreasing(i);
        }

        for (int i = maxLineLength - 1; i >= 1; i--) {
            printLineOfNumbersIncreasing(i);
        }
    }

    static void printLineOfNumbersIncreasing(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i + " ");
            if (i < maxNumber) {
                System.out.print("");
            }
        }
        System.out.println();
    }


}

