import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 100/100
public class EasterGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");
        List<String> gifts = new ArrayList<>();

        for (int i = 0; i < inputAsArray.length ; i++) {
            gifts.add(inputAsArray[i]);
        }

        while (true){
            input = scanner.nextLine();
            if (input.equals("No Money")) {
                break;
            }
            String[] inputAsAnArray = input.split(" ");
            String command = inputAsAnArray[0];
            String currentGift = inputAsAnArray[1];

            switch (command) {
                case "OutOfStock":

                    for (int i = 0; i < gifts.size(); i++) {
                        if (gifts.contains(currentGift)) {
                            gifts.set(gifts.indexOf(currentGift), "None");

                        }
                    }

                    break;
                case "Required":
                    int index = Integer.parseInt(inputAsAnArray[2]);
                    if (index <= gifts.size() - 1 && index >= 0) {
                        gifts.set(index, currentGift);
                    }
                    break;
                case "JustInCase":
                    gifts.set(gifts.size()-1, currentGift);
                    break;
            }

        }
        for (int i = 0; i < gifts.size(); i++) {
            gifts.remove("None");
        }
        for (String gift : gifts) {
            System.out.print(gift + " ");
        }

    }
}
