import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task4_SantasSecretHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        List <String> goodKids = new ArrayList<>();
        while (!input.equals("end")){

            String decrypted =  "";

            for (int i = 0; i < input.length(); i++) {

                decrypted += (char)(input.charAt(i) - key);
            }

            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@!:>-]+(?<behavior>![GN]!)");
            Matcher matcher = pattern.matcher(decrypted);

            while (matcher.find()) {
                if (matcher.group("behavior").equals("!G!")){
                    goodKids.add(matcher.group("name"));
                }
            }


            input = scanner.nextLine();
        }


        for (String goodKid : goodKids) {
            System.out.println(goodKid);
        }

    }
}
