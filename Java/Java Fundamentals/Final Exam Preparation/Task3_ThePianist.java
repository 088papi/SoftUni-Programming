import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//100/100
public class Task3_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceKey = new TreeMap<>();
        Map<String, String> pieceComposer = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String piece = data[0];
            String composer = data[1];
            String songKey = data[2];

            pieceComposer.put(piece, composer);
            pieceKey.put(piece, songKey);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split("\\|");
            String command = data[0];

            switch (command) {
                case "Add":
                    String piece = data[1];
                    String composer = data[2];
                    String key = data[3];

                    if (pieceComposer.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");

                    } else {
                        pieceComposer.put(piece, composer);
                        pieceKey.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    piece = data[1];
                    if (pieceComposer.containsKey(piece)) {
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    piece = data[1];
                    String newKey = data[2];
                    if (pieceComposer.containsKey(piece)) {
                        pieceKey.put(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        pieceComposer.entrySet()
                .stream()
                .sorted((a,b)-> a.getValue().compareTo(b.getValue()))
                .sorted((a,b) -> a.getKey().compareTo(b.getKey()))
                .forEach(a-> System.out.printf("%s -> Composer: %s, Key: %s%n", a.getKey(),a.getValue(), pieceKey.get(a.getKey())));

    }
}
