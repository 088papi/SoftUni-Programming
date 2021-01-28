import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task11_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        Map<String, Predicate<String>> predicates = new HashMap<>();

        while (!input.equals("Print")) {
            String[] data = input.split(";");
            String predicateName = data[1] + data[2];
            switch (data[0]) {
                case "Add filter":
                    Predicate<String> predicate = getPredicate(data);
                    predicates.put(predicateName, predicate);
                    break;
                case "Remove filter":
                    predicates.remove(predicateName);
                    break;
            }


            input = scanner.nextLine();

        }

        guests.stream().filter(guest -> {
            boolean isValid = true;
            for (Predicate<String> predicate : predicates.values()) {
                if (predicate.test(guest)) {
                    isValid = false;
                    break;
                }
            }
            return isValid;
        }).forEach(e -> System.out.print(e + " "));

    }


    private static Predicate<String> getPredicate(String[] data) {
        Predicate<String> predicate = null;
        if (data[1].equals("Starts with")) {
            predicate = name -> name.startsWith(data[2]);
        } else if (data[1].equals("Ends with")) {
            predicate = name -> name.endsWith(data[2]);
        } else if (data[1].equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(data[2]);
        } else {
            predicate = name -> name.contains(data[2]);
        }


        return predicate;
    }
}


