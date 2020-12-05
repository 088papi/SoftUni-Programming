import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//90/100
public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");

        List<Integer> numbers = new ArrayList<>();


        for (String s : inputAsArray) {
            numbers.add(Integer.parseInt(s));
        }

        while (true) {

            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            }

            String[] commandAsArray = command.split(" ");
            int index = Integer.parseInt(commandAsArray[1]);
            switch (commandAsArray[0]) {

                case "Shoot":
                    if (index < numbers.size() && index >= 0) {
                        int power = Integer.parseInt(commandAsArray[2]);
                        if (numbers.get(index) <= power) {
                            numbers.remove(index);
                        } else {
                            numbers.set(index, numbers.get(index) - power);
                        }
                    }
                    break;

                case "Add":

                    if (index < numbers.size() && index >= 0) {
                        int value = Integer.parseInt(commandAsArray[2]);
                        numbers.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":

                    int radius = Integer.parseInt(commandAsArray[2]);

                    if ((index-radius) <= 0 || (index+radius) >= numbers.size()-1){
                        System.out.println("Strike missed!");

                    } else {
                        for (int i = 0; i < radius; i++) {
                            numbers.remove(index + 1);
                            numbers.remove(index - 1);

                        }
                        numbers.remove(index - radius);

                        break;
                    }



            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print("|");
            }
        }
    }
}