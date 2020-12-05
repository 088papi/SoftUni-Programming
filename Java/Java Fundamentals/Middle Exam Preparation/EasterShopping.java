import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//100/100
public class EasterShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        String[] inputAsArray = input.split(" ");
        List<String> shops = new ArrayList<>();

        for (int i = 0; i < inputAsArray.length; i++) {
            shops.add(inputAsArray[i]);
        }

        for (int i = 0; i < numberOfCommands; i++) {


            input = scanner.nextLine();


            String[] inputAsAnArray = input.split(" ");
            String command = inputAsAnArray[0];

            switch (command) {
                case "Include":
                    String shop = inputAsAnArray[1];
                    shops.add(shop);
                    break;
                case "Visit":
                    String firstOrLast = inputAsAnArray[1];
                    int numberOfShops = Integer.parseInt(inputAsAnArray[2]);

                    if (numberOfShops > shops.size()) {
                        continue;
                    }

                    for (int j = 0; j < numberOfShops; j++) {
                        if (firstOrLast.equals("first")) {
                            shops.remove(0);
                        } else if (firstOrLast.equals("last")) {
                            shops.remove(shops.size() - 1);
                        }
                    }

                    break;
                case "Prefer":


                    int index1 = Integer.parseInt(inputAsAnArray[1]);
                    int index2 = Integer.parseInt(inputAsAnArray[2]);

                    if (index1 >= shops.size() || index2 >= shops.size()) {
                        continue;
                    }

                    Collections.swap(shops, index1,index2);
                    break;

                case "Place":

                    int shopIndex = Integer.parseInt(inputAsAnArray[2]);

                    if (shopIndex < shops.size()) {

                        shop = inputAsAnArray[1];

                        shops.add(shopIndex + 1, shop);
                    }
                    break;
            }

        }

        System.out.println("Shops left:");
        for (int i = 0; i < shops.size(); i++) {
            System.out.print(shops.get(i) + " ");
        }

    }


}
