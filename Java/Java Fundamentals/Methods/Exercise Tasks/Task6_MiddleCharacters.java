import java.util.Scanner;

public class Task6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//направи си метод :D //100/100
        String input = scanner.nextLine();
        char currentChar;
        char previousChar;

        for (int i = 1; i <= input.length() ; i++) {
            if (input.length() % 2 == 0) {
              currentChar = input.charAt(input.length()/2);
                previousChar = (char) ((input.charAt((input.length() - 1)/ 2)));
              System.out.printf("%c%c",previousChar, currentChar);
              break;
        } else {
                currentChar=input.charAt(input.length()/2);
                System.out.printf("%c", currentChar);
                break;
            }
        }
    }
    // a S t r i n g
//     s o m e t e x t

}