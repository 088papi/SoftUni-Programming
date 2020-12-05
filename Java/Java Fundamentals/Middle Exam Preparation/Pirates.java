import java.util.Scanner;
//100/100
public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double gainedPlunder = 0;
        int counter = 1;

        for (int i = 1; i <= days; i++) {

            gainedPlunder += dailyPlunder;

            if (counter % 3 == 0) {
                gainedPlunder += (0.5 * dailyPlunder);
            }

            if (counter % 5 == 0) {
                gainedPlunder -= (0.3 * gainedPlunder);
            }
            counter++;
        }

        if (gainedPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gainedPlunder );
        } else {

            double percent = gainedPlunder/expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }

    }
}
