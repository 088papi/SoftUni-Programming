import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cat> cats = new HashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] data = input.split("\\s+");
            String breed = data[0];
            String name = data[1];
            double other = Double.parseDouble(data[2]);


            switch (breed) {
                case "Cymric":
                    Cymric cymric = new Cymric(name,other);
                    cats.put(name, cymric);
                    break;
                case "Siamese":
                    Siamese siamese = new Siamese(name,other);
                    cats.put(name,siamese);
                    break;
                case "StreetExtraordinaire":
                    StreetExtraordinaire streetExtraordinaire = new StreetExtraordinaire(name, other);
                    cats.put(name,streetExtraordinaire);
                    break;
            }

        }

        String wantedCat = scanner.nextLine();
        if (cats.containsKey(wantedCat)){
            System.out.println(cats.get(wantedCat).toString());
        }


    }
}
