import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//100/100
public class Task2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s"))
                .collect(Collectors.toList());


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Delete":
                    String toDelete = data[1];
                    while (numbers.contains(toDelete)) {
                        numbers.remove(toDelete);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    String element = data[1];

                    if (index < numbers.size()) {
                        numbers.add(index, element);
                    }
                    break;
            }


        }
        System.out.print(String.join(" ", numbers));
    }
}
