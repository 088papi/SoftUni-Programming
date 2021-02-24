import java.util.Scanner;

public class Task1_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printUpperTriangle(n);

        printLowerTriangle(n);

    }

    private static void printLowerTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(repeatString(i, " " ));
            System.out.print(repeatString(n - i, "* "));
            System.out.println();
        }
    }

    private static void printUpperTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(repeatString(n - i, " "));
            System.out.print(repeatString(i, "* " ));
            System.out.println();
        }
    }


    public static String repeatString(int count, String stars){
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            out.append(stars);
        }

        return out.toString();
    }
}
