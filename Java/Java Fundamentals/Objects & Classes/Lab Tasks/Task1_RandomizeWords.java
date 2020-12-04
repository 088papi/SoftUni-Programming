import java.util.Random;
import java.util.Scanner;

public class Task1_RandomizeWords {
//100/100

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Random randomGeneration = new Random();

        for (int i = 0; i < words.length; i++) {
            int x = randomGeneration.nextInt(words.length);
            int y = randomGeneration.nextInt(words.length);
            String oldWordsX = words[x];
            words[x] = words[y];
            words[y] = oldWordsX;
        }
// random words
        System.out.println(String.join(System.lineSeparator(), words));


    }
}
