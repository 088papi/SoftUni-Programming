import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character,Integer> occurrences = new TreeMap<>();
        for (int i = 0; i < input.length() ; i++) {
            char c = input.charAt(i);

            if (occurrences.containsKey(c)){
                occurrences.put(c,occurrences.get(c) +1);
            } else{
                occurrences.put(c,1);
            }
        }

        occurrences.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));
    }
}
