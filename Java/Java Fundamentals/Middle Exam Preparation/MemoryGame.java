import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//100/100
public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");
        int countMoves = 0;

        List<String> sequence = new ArrayList<>(Arrays.asList(inputAsArray));


        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Sorry you lose :(");
                System.out.println(String.join(" ", sequence));
                break;
            }

            String[] givenIntegers = input.split(" ");
            int firstGiven = Integer.parseInt(givenIntegers[0]);
            int secondGiven = Integer.parseInt(givenIntegers[1]);


            if (firstGiven == secondGiven ||
                    firstGiven < 0 || secondGiven < 0 || firstGiven >= sequence.size()
                    || secondGiven >= sequence.size()) {
                System.out.println("Invalid input! Adding additional elements to the board");
                countMoves++;
                sequence.add(sequence.size() / 2, "-" + countMoves + "a");
                sequence.add(sequence.size() / 2, "-" + countMoves + "a");
                continue;

            }
            if (sequence.get(firstGiven).equals(sequence.get(secondGiven))) {
                countMoves++;
                System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(firstGiven));
                if (firstGiven > secondGiven) {
                    sequence.remove(firstGiven);
                    sequence.remove(secondGiven);
                } else {
                    sequence.remove(secondGiven);
                    sequence.remove(firstGiven);
                }

                if (sequence.size() == 0) {
                    System.out.printf("You have won in %d turns!%n", countMoves);
                    return;
                }

            } else if (!(sequence.get(firstGiven).equals(sequence.get(secondGiven)))) {
                countMoves++;
                System.out.println("Try again!");
            }


        }

    }
}
