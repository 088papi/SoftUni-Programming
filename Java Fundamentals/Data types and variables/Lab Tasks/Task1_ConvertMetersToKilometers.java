import java.util.Scanner;
//100 / 100
public class Task1_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int meters = Integer.parseInt(scanner.nextLine());

        double toKilometers = 1.0 * meters / 1000;

        System.out.printf("%.2f", toKilometers);
}
}