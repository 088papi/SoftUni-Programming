import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// submit in Judge
public class Task3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = parseLineOfNumbers(scanner);
        List<Integer> secondList = parseLineOfNumbers(scanner);
        List<Integer> resultList = new ArrayList<>();
        int indexFirst = 0;
        int indexSecond = 0;


        while (indexFirst < firstList.size() || indexSecond < secondList.size()) {
            if (indexFirst < firstList.size()) {
                resultList.add(firstList.get(indexFirst));
            }
            if (indexSecond < secondList.size()) {
                resultList.add(secondList.get(indexSecond));
            }
            indexFirst++;
            indexSecond++;
        }

        for (int number : resultList) {
            System.out.print(number + " ");
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

