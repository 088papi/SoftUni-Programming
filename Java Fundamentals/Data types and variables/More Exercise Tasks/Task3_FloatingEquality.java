import java.math.BigDecimal;
import java.util.Scanner;
//100/100
public class Task3_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (a - b < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
