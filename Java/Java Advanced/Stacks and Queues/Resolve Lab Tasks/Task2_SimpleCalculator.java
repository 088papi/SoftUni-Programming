import java.util.ArrayDeque;
import java.util.Scanner;

public class Task2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> calculations = new ArrayDeque<>();
        ArrayDeque<String> operands = new ArrayDeque<>();
        for (String s : input) {

            char current = s.charAt(0);

            if (Character.isDigit(current)) {
                int num = Integer.parseInt(s);
                calculations.push(num);
            } else {
                switch (current) {
                    case '+':
                    case '-':
                        operands.push(String.valueOf(current));
                        break;
                }
            }

            if (calculations.size() == 2) {
                int currentNumber = calculations.pop();
                int previousNumber = calculations.pop();

                if (operands.poll().equals("+")) {
                    calculations.push(previousNumber + currentNumber);
                } else {
                    calculations.push(previousNumber - currentNumber);
                }
            }


        }
        System.out.println(calculations.pop());


    }
}
