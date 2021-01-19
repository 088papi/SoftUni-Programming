import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Double, Integer> occurrences = new LinkedHashMap<>();
        int counter = 0;

        String[] values = scanner.nextLine().split(" ");

        for (int i = 0; i <  values.length; i++) {

            double number = Double.parseDouble(values[i]);

            if (occurrences.containsKey(number)){
                occurrences.put(number,occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }

        }


        occurrences.forEach((a,b) -> System.out.printf("%.1f -> %d%n",a,b));
    }

}
