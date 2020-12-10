import java.util.Scanner;

public class Ex04_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double unit = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();

      if (first.equals("mm")) {
          unit = unit / 1000;
      } else if (first.equals("cm")) {
          unit = unit / 100;
      }
if (second.equals("mm")) {
    unit = unit * 1000;
} else if (second.equals("cm")) {
    unit = unit * 100;
}
        System.out.printf("%.3f", unit);



    }
}
