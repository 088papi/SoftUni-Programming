import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
///100/100
public class Task3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> guests = new ArrayList<>();
        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] tokens = scanner.nextLine().split("\\s");
            String name = tokens[0];
            String not = tokens[2];
            if ("not".equals(tokens[2])) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }

            } else {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            }

        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
