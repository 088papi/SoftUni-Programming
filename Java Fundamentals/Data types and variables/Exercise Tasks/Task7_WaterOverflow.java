import java.util.Scanner;
//100/100
public class Task7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;

        int numberLines = Integer.parseInt(scanner.nextLine());
        int allLitres = 0;

        for (int i = 0; i < numberLines ; i++) {


            int litres = Integer.parseInt(scanner.nextLine());

            allLitres += litres;

            if (allLitres > capacity) {
                System.out.println("Insufficient capacity!");
                allLitres -= litres;
            }

        }
        System.out.println(allLitres);

    }
}
