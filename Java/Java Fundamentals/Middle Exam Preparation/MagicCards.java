import java.util.*;
//100/100
public class MagicCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] inputAsArray = input.split(":");
        List<String> receivedCards = new ArrayList<>();

        List<String> newDeck = new ArrayList<>();

        receivedCards.addAll(Arrays.asList(inputAsArray));

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("Ready")) {
                break;
            }
            String[] stringAsArray = string.split(" ");
            String command = stringAsArray[0];
            String cardName = stringAsArray[1];

            switch (command) {
                case "Add":
                    if (receivedCards.contains(cardName)) {
                        newDeck.add(cardName); // вариант за грешка
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(stringAsArray[2]);

                    if (receivedCards.contains(cardName)
                    && index <= newDeck.size() && index >= 0 ) {
                        newDeck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (newDeck.contains(cardName)) {
                        newDeck.remove(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String cardName2 = stringAsArray[2];
                    int index1 = newDeck.indexOf(cardName);
                    int index2 = newDeck.indexOf(cardName2);
                    Collections.swap(newDeck, index1, index2);
                    break;

                case "Shuffle":
                    if (cardName.equals("deck")) {
                        Collections.reverse(newDeck);
                    }
                    break;
            }

        }

        System.out.println(String.join(" ", newDeck));

    }
}
