import java.util.Scanner;
//100/100
public class Task1_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printNum(Integer.parseInt(scanner.nextLine()));

    }

    public static void printNum(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}

