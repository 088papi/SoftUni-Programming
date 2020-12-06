import java.util.Scanner;
//100/100
public class Task3_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i < bannedWords.length ; i++) {

            String banWord = bannedWords[i];
            if (text.contains(banWord)) {
                String replacement = repeat("*", banWord.length());
                text = text.replace(banWord, replacement);
            }

        }
        System.out.println(text);
    }

    static String repeat(String s, int count) {
        String[] repeatArray = new String[count];
        for (int i = 0; i < count ; i++) {
            repeatArray[i] = s;
        }
        return String.join("", repeatArray);
    }
}
