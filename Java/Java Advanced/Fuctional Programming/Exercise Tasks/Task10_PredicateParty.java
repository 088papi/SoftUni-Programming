import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Task10_PredicateParty {
   static List<String> names = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();




        while (!input.equals("Party!")) {
                String[] data = input.split("\\s+");

                switch (data[0]){
                    case "Double":
                        addOneMore(getPredicate(data));
                        break;
                    case "Remove":
                        removeName(getPredicate(data));
                        break;
                }


            input = scanner.nextLine();

        }

        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("([\\[|\\]])", "") + "are going to the party!");
        }
    }

    private static void addOneMore(Predicate<String> predicate) {
        List<String> namesToAdd = new ArrayList<>();
        names.stream().filter(predicate).forEach(namesToAdd::add);
        names.addAll(namesToAdd);
    }

    private static void removeName(Predicate<String> predicate) {
        names.removeIf(predicate);
    }


    private static Predicate<String> getPredicate(String[] data) {
    Predicate<String> predicate = null;
    if (data[1].equals("StartsWith")){
        predicate = name -> name.startsWith(data[2]);
    } else if (data[1].equals("EndsWith")){
        predicate = name -> name.endsWith(data[2]);
    } else {
        predicate = name -> name.length() == Integer.parseInt(data[2]);
    }



    return predicate;
    }
}
