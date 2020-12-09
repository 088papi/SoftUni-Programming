import java.util.*;
import java.util.stream.Collectors;

//100/100
public class Task7_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nonNegativeNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                nonNegativeNumbers.add(numbers.get(i));
            }
        }

        if (nonNegativeNumbers.isEmpty()) {
            System.out.println("empty");
        }
        Collections.reverse(nonNegativeNumbers);
        for (int number : nonNegativeNumbers) {
            System.out.print(number + " ");

        }
    }
}
