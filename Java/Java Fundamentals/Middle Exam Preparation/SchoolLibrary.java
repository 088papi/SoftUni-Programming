import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// 100/100
public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split("&");

        List<String> booksOnShelf = new ArrayList<>();

        for (int i = 0; i < inputAsArray.length; i++) {
            booksOnShelf.add(inputAsArray[i]);
        }

        while (true) {

            String command = scanner.nextLine();
            if (command.equals("Done")) {
                break;
            }
            String[] commands = command.split(" \\| ");

            String firstCommand = commands[0];
            String bookName = commands[1];


            switch (firstCommand) {
                case "Add Book":
                    if (!booksOnShelf.contains(bookName)) {
                        booksOnShelf.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    if (booksOnShelf.contains(bookName)) {
                        booksOnShelf.remove(bookName);
                    }
                    break;
                case "Insert Book":
                    booksOnShelf.add(bookName);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(bookName);
                    if (index <= booksOnShelf.size()) {
                        System.out.println(booksOnShelf.get(index));
                    }
                    break;
                case "Swap Books":
                    swapStringsInAList(booksOnShelf, commands);
                    break;
            }


        }
        for (int i = 0; i < booksOnShelf.size(); i++) {
            System.out.print(booksOnShelf.get(i));
            if (i < booksOnShelf.size() - 1) {
                System.out.print(", ");
            }
        }

    }

    private static void swapStringsInAList(List<String> booksOnShelf, String[] commands) {
        String firstBookName = commands[1];
        String secondBookName = commands[2];
        if (booksOnShelf.contains(firstBookName) && booksOnShelf.contains(secondBookName)) {
            int index1 = booksOnShelf.indexOf(firstBookName);
            int index2 = booksOnShelf.indexOf(secondBookName);

            Collections.swap(booksOnShelf, index1, index2);
        }
    }
}

