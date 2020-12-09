import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }

        while (!line.equals("end")) {

            String[] commands = line.split(" ");


            switch (commands[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commands[1])); // това ще премахне по елемент
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
                    break;
            }
            line = scanner.nextLine();
        }

        for (int number: numbers) {
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
