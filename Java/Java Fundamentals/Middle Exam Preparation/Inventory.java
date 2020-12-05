import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split(", ");
        List<String> collection = new ArrayList<>();

        for (int i = 0; i < inputAsArray.length ; i++) {
            collection.add(inputAsArray[i]);
        }

        while (true) {
            String commandsLine = scanner.nextLine();
            if (commandsLine.equals("Craft!")) {
                break;
            }
            String[] commandLineArray = commandsLine.split(" - ");
            String command = commandLineArray[0];
            String item = commandLineArray[1];

            switch (command) {
                case "Collect":
                    if (!collection.contains(item)){
                        collection.add(item);
                    }
                    break;
                case "Drop":
                    if (collection.contains(item)) {
                        collection.remove(item);
                    }
                    break;

               case "Combine Items":
                    String[] combinedItems = item.split(":");
                    String oldItem = combinedItems[0];
                    String newItem = combinedItems[1];

                    if (collection.contains(oldItem)){
                        int index = collection.indexOf(oldItem);
                        collection.add(index+1, newItem);
                    }
                    break;

                case "Renew":
                    if (collection.contains(item)) {
                        collection.remove(item);
                        collection.add(item);
                    }
                    break;
            }


        }

        System.out.println(String.join(", ", collection));
        
    }
}
