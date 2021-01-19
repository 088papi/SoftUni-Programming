import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();
        while (!input.equals("END")){
            String[] data = input.split(", ");
            String command = data[0];
            String number = data[1];

            switch (command){
                case "IN":
                    parking.add(number);
                    break;
                case "OUT":
                    parking.remove(number);
                    break;
            }

            input = scanner.nextLine();
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            parking.forEach(System.out::println);
        }
    }
}
