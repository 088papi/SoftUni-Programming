import java.util.*;
import java.util.function.Predicate;

public class Task6_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();

        List<Integer> nums = new ArrayList<>();

        for (int i = range[0]; i <= range[1]; i++) {
            nums.add(i);
        }

        if (command.equals("odd")) {
            List<Integer> evens = isEven(nums, e-> e % 2 != 0);
            for (Integer even : evens) {
                System.out.print(even + " ");
            }

        } else if (command.equals("even")) {
            List<Integer> odds = isOdd(nums, e-> e % 2 == 0);
            for (Integer odd : odds) {
                System.out.print(odd + " ");
            }
        }


    }

    private static List<Integer> isEven(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> evens = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                evens.add(number);
            }
        }
        return evens;
    }


    private static List<Integer> isOdd(List<Integer> numbers, Predicate<Integer> predicate){
        List<Integer> odds = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                odds.add(number);
            }
        }
        return odds;
    }
}