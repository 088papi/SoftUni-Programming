import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> elements = new TreeSet<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int j = 0; j < data.length ; j++) {
                elements.add(data[j]);
            }
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }




    }
}
