import java.util.Scanner;

public class Lab06_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        if (shape.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double area = a*a;
            System.out.printf("%.3f", area);
        } else if (shape.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double area = b * c;
            System.out.printf("%.3f", area);
        } else if (shape.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = Math.PI*a*a;
            System.out.printf("%.3f", area);
            } else if (shape.equals("triangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double area = (b * c) / 2;
            System.out.printf("%.3f", area);
        }
    }
}
