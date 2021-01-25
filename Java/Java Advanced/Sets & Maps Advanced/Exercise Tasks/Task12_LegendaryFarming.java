import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task12_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new HashMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] data = scanner.nextLine().split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                if (material.equals("motes") || material.equals("shards") || material.equals("fragments")) {

                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250) {
                        materials.put(material, materials.get(material) - 250);

                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }

                        isObtained = true;
                        break;
                    }


                } else {
                    junk.putIfAbsent(material, 0);
                    int junkQuantity = junk.get(material);
                    junk.put(material, quantity + junkQuantity);
                }

            }
        }

        materials.entrySet().stream().sorted((a,b) -> {
            int result = b.getValue().compareTo(a.getValue());
            if (result == 0){
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue());
        });

        junk.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
    }
}
