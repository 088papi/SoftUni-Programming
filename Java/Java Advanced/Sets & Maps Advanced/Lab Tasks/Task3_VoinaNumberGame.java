import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roundsCounter = 1;

        Set<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        while (roundsCounter <= 50) {

            if (deck1.isEmpty()) {
                System.out.println("First player win!");
                return;
            } else if (deck2.isEmpty()) {
                System.out.println("Second player win");
                return;
            }
            int first = deck1.iterator().next();
            int second = deck2.iterator().next();
            deck1.remove(first);
            deck2.remove(second);



            if (first > second) {
                deck1.add(first);
                deck1.add(second);
            } else {
                deck2.add(first);
                deck2.add(second);
            }
            roundsCounter++;
        }


        if (deck1.size() == deck2.size()){
            System.out.println("Draw!");
        } else if (deck1.size() > deck2.size()){
            System.out.println("First player win!");
        } else if (deck2.size() > deck1.size()){
            System.out.println("Second player win!");
        }

    }
}

