import java.util.Scanner;
// 100/100 - РЕШЕНО
public class Ex01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        int counter = 0;
        String input = scanner.nextLine();
        boolean isFound = false; //boolean flag - все едно казваме не е намерена

        while (!input.equals("No More Books")) {
            if (favoriteBook.equals(input)) {
                System.out.printf("You checked %d books and found it.", counter);
                isFound = true;
                break;
            }

            counter++;
            input = scanner.nextLine();
        }
        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
