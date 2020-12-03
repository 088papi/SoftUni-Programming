import java.util.Scanner;
//100/100
public class Task9_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double givenMoney = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double priceSabre = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double extraSabres = Math.ceil(0.10 * studentCount);
        double sabres = (studentCount + extraSabres) * priceSabre;
        double freeBelts = studentCount / 6.00;

        double robes = priceRobe * studentCount;
        double beltStudents = 0;
        for (int i = 1; i <= studentCount; i++) {
            if (i % 6 != 0) {
                beltStudents++;
            }
        }
        double belts = priceBelt * beltStudents;
        double total = sabres + belts + robes;
        if (total <= givenMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", total);
        } else {
            double neededMoney = Math.abs(total - givenMoney);
            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney);
        }

    }
}
