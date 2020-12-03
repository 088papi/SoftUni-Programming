import java.util.Scanner;
//100/100
public class Task10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int crashedHeadsetCounter = 0;
        int crashedMouseCounter = 0;
        int crashedKeyboardCounter = 0;
        int crashedDisplayCounter = 0;
        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                crashedHeadsetCounter++;
            }

            if (i % 3 == 0) {
                crashedMouseCounter++;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                crashedKeyboardCounter++;
                if (crashedKeyboardCounter % 2 == 0) {
                    crashedDisplayCounter++;
                }
            }


        }

    double rageExpenses = (crashedHeadsetCounter * headsetPrice) +
            (crashedMouseCounter * mousePrice) + (crashedKeyboardCounter * keyboardPrice)
            + (crashedDisplayCounter * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
