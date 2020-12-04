import java.text.DecimalFormat;
import java.util.Scanner;
//100/100
public class Task08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getMathPow(num,pow)));

    }

    static double getMathPow(double number, int power) {

        return Math.pow(number,power);
    }

}
