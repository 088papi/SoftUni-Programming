import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> namesAndEmails = new LinkedHashMap<>();

        while (true){
            String name = scanner.nextLine();
            if (name.equals("stop")){
                break;
            }
            String email = scanner.nextLine();

            Pattern pattern = Pattern.compile("[.bg||.BG]+$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                namesAndEmails.put(name,email);
            }

        }

        namesAndEmails.forEach((a,b)-> {
            System.out.printf("%s -> %s%n", a,b);
        });
    }
}
