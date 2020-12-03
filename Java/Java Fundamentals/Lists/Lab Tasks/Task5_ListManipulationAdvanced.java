import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Submit in Judge
public class Task5_ListManipulationAdvanced {
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
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commands[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (commands[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");

                            }

                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    if (commands[1].equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum = sum + numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    if (commands[1].equals(">=")) {
                        int currentNumber = Integer.parseInt(commands[2]);

                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= currentNumber) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commands[1].equals(("<"))) {
                        int currentNumber = Integer.parseInt(commands[2]);

                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < currentNumber) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }


                    break;

            }
            line = scanner.nextLine();
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
