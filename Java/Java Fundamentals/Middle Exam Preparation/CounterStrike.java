import java.util.Scanner;
// 100/100
public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wonBattles = 0;
        int initialEnergy = Integer.parseInt(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End of battle")) {
                break;
            }
            int distance = Integer.parseInt(input);

            if (initialEnergy > 0 && initialEnergy >= distance) {
                initialEnergy -= distance;
                wonBattles++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                return;
            }
            if (wonBattles % 3 == 0) {
                initialEnergy += wonBattles;

            }
        }


        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);

    }


}
