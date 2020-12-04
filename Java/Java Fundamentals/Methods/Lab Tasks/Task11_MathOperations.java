import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
//100/100
public class Task11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculation(n1,operator,n2)));
    }

public static double calculation (int a, String operator, int b) {
        int result = 0;
    switch (operator) {
        case "+":
            result = a + b;
            break;
        case "-":
            result = a - b;
            break;
        case "*":
            result = a * b;
            break;
        case "/":
            result = a / b;
    }
    return result;
}
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void divide(int a, int b){
        System.out.println(a / b);
    }

}



