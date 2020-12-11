import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder msg = new StringBuilder();

        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");
        List<Integer> key = new ArrayList<>();

        for (String s : inputAsArray) {
            key.add(Integer.parseInt(s));
        }

        String data = scanner.nextLine();

        while (!data.equals("find")) {

            int keyCounter = 0;
            for (int i = 0; i < data.length(); i++) {

                msg.append((char)(data.charAt(i) - key.get(keyCounter)));
                keyCounter++;
                if (keyCounter == key.size()) {
                    keyCounter = 0;
                }

            }

            String type = msg.substring(msg.indexOf("&")+1, msg.lastIndexOf("&"));
            String coordinates = msg.substring(msg.indexOf("<")+1, msg.indexOf(">"));


            System.out.printf("Found %s at %s%n", type, coordinates);
            msg = new StringBuilder();
            data = scanner.nextLine();
        }

    }
}
