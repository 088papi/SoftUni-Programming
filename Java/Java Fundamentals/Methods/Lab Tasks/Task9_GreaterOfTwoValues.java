import java.util.Scanner;

public class Task9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String type = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
                break;
            case "char":
                System.out.println(getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));
                break;
            case "string":
                System.out.println(getMax(scanner.nextLine(),scanner.nextLine()));
                break;
        }


    }


    static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}