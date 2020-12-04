import java.util.Scanner;
//100/100
public class Task2_VowelsCount {
    //решена провери
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        System.out.println(getVowels(input));


    }

    static int getVowels (String input) {
        int vowelsCounter = 0;
//100/100
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            switch (currentChar) {
                case 'a':
                case 'e':
                case 'u':
                case 'y':
                case 'o':
                case 'i':
                case 'A':
                case 'E':
                case 'U':
                case 'Y':
                case 'O':
                case 'I':
                    vowelsCounter++;
                    break;

            }

        }
        return vowelsCounter;
    }
}
