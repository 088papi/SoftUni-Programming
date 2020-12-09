import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//100/100

        Map<String, Map<Integer, Double>> demons = new TreeMap<>();

        String input = scanner.nextLine();
        String[] data = input.split(",\\s*");

        String healthRegex = "[^0-9+*/.-]";
        Pattern healthPattern = Pattern.compile(healthRegex);

        for (int i = 0; i < data.length; i++) {
            String demonName = data[i].replaceAll(" ", "");
            int health = 0;
            Matcher healthMatcher = healthPattern.matcher(demonName);
            String match = "";
            while (healthMatcher.find()) {
                match = healthMatcher.group();

                for (int j = 0; j < match.length(); j++) {
                    health += (int) match.charAt(j);
                }

            }
            String damageRegex = "[+-]?[0-9]+\\.?[0-9]*";
            Pattern damagePattern = Pattern.compile(damageRegex);
            Matcher damageMatcher = damagePattern.matcher(demonName);
            double baseDamage = 0.0;

            while (damageMatcher.find()) {
                double number = Double.parseDouble(damageMatcher.group());
                baseDamage += number;
            }

            String signRegex = "[*/]";
            Pattern signPattern = Pattern.compile(signRegex);
            Matcher signMatcher = signPattern.matcher(demonName);

            while (signMatcher.find()) {
                if (signMatcher.group().equals("*")) {
                    baseDamage *= 2;
                } else if (signMatcher.group().equals("/")) {
                    baseDamage /= 2;
                }
            }
            Map<Integer, Double> demon = new TreeMap<>();
            if (baseDamage != 0) {
                demon.put(health, baseDamage);
            } else {
                demon.put(health, 0.0);
            }

            demons.put(demonName, demon);
        }

        //M3ph-0.5s-0.5t0.0** - 524 health, 8.00 damage
        demons.entrySet().forEach(a-> {
            a.getValue().entrySet().stream().forEach(b->{
                System.out.printf("%s - %d health, %.2f damage%n", a.getKey(),b.getKey(),b.getValue());
            });
        });
    }
}