import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] stringAsArray = string.split("!");

        List<String> shoppingList = new ArrayList<>();

        for (int i = 0; i <stringAsArray.length ; i++) {
            shoppingList.add(stringAsArray[i]);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Go Shopping!")) {
                break;
            }

            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            String item = inputArray[1];

            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = inputArray[2];
                    if (shoppingList.contains(item)) {
                        shoppingList.set(shoppingList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", shoppingList));
    }
}
