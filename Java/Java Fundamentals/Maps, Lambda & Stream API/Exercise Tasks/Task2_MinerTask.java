import java.util.*;
//100/100
public class Task2_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();

        while (true) {

            String material = scanner.nextLine();

            if (material.equals("stop")) {
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!materials.containsKey(material)) {
                materials.put(material,quantity);
            } else {
                int val = materials.get(material);
                materials.put(material, val += quantity);
            }

            /*

              if (!counts.containsKey(num))
    counts.put(num, 0);
  counts.put(num, counts.get(num) + 1);
}

             */
        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
