import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        List<Integer> newList = new ArrayList<>();

        int i = 0;

        while (i < numbers.size() / 2) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
            newList.add(sum);
            i++;
        }
        if (numbers.size() % 2 != 0) {
            newList.add(numbers.get(numbers.size() / 2));

        }
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }

    }
    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
