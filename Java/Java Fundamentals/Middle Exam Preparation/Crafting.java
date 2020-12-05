import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//100/100
public class Crafting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split("\\|");
        List<String> weaponParts = new ArrayList<>();

        Collections.addAll(weaponParts, inputAsArray);

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("Done")) {
                break;
            }
            String[] stringAsArray = string.split(" ");
            String command = stringAsArray[0];
            String command2 = stringAsArray[1];

            switch (command) {
                case "Move":
                    int index = Integer.parseInt(stringAsArray[2]);

                    if (command2.equals("Left")) {

                        if (index < weaponParts.size() && index > 0) {

                            Collections.swap(weaponParts, index, index - 1);

                            //check for out of bounds exception
                            // a possible mistake
                        } else {
                            continue;
                        }
                    } else if (command2.equals("Right")) {
                        if (index < weaponParts.size() -1 && index >= 0) {

                            Collections.swap(weaponParts, index, index + 1);

                        } else {
                            continue;
                        }
                    }
                    break;
                case "Check":
                    if (command2.equals("Even")) {
                        for (int i = 0; i < weaponParts.size(); i++) {
                            if (i % 2 == 0) {
                                System.out.print(weaponParts.get(i) + " ");

                            }
                        }
                        System.out.println();
                    } else if (command2.equals("Odd")) {
                        for (int i = 0; i < weaponParts.size(); i++) {
                            if (i % 2 != 0) {
                                System.out.print(weaponParts.get(i) + " ");

                            }
                        }
                        System.out.println();
                        break;
                    }


            }


        }


        System.out.print("You crafted ");
        for (String weaponPart : weaponParts) {
            System.out.print(weaponPart);
        }
        System.out.print("!");

    }
}


