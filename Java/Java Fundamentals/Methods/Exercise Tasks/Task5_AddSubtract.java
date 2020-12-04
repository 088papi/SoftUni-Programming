import java.util.Scanner;
// 100/100
public class Task5_AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubtract(a, b, c));
    }

public static int getSubtract (int c, int d, int f) {
    return getSum(c,d) - f;
}
public static int getSum (int a, int b) {
    return a + b;
}

}
