import java.util.Scanner;

public class Task2_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String input = scanner.nextLine();

        int index = input.indexOf(word);


        while (index != -1) {
            input.replace(word, "");
            
        }
    }

}
