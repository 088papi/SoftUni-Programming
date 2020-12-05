import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//100/100
public class Task1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> numberOccurences = new TreeMap<>();

        String[] numbersAsStrings = scanner.nextLine().split(" ");

        for (int i = 0; i < numbersAsStrings.length; i++) {
            int number = Integer.parseInt(numbersAsStrings[i]);

            Integer occurences = numberOccurences.get(number);
            if (occurences == null) {
                occurences = 0;
            }

            numberOccurences.put(number, occurences + 1);


        }

      for (Map.Entry<Integer, Integer> entry : numberOccurences.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }


    }
}
