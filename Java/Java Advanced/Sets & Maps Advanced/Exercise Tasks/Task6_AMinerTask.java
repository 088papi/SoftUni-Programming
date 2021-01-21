import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)) {
                resources.put(input,resources.get(input) + quantity);
            }else {
                resources.put(input,quantity);
            }
            input = scanner.nextLine();
        }

        resources.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
