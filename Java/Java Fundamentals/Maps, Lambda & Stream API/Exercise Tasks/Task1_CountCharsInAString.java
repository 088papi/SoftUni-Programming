import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//100/100
public class Task1_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Character, Integer> chars = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {  // с гет взимаме стойността
                if (chars.containsKey(symbol)) {
                    int count = chars.get(symbol);
                    chars.put(symbol, count + 1);
                } else {
                    chars.put(symbol, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // chars.forEach(k,v) -> sout(k + " -> " + v));

    }
}
