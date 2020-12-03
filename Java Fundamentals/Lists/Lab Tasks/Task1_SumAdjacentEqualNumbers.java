import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

// submit in Judge
public class Task1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = parseLineOfNumbers(scanner);


        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {

                double current = numbers.get(i);

                double next = numbers.get(i + 1);

                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }
            }
        }
        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }

    private static List<Double> parseLineOfNumbers(Scanner scanner) {

        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            double number = Double.parseDouble(s);
            numbers.add((double) number);
        }
        return numbers;
    }

}
