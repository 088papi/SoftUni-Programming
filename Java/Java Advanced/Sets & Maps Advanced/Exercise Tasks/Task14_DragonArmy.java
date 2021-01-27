import java.util.*;

public class Task14_DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, TreeMap<String, int[]>> typeNameAndStats = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] stats = scanner.nextLine().split(" ");
            String type = stats[0];
            String name = stats[1];
            int damage;
            if (stats[2].equals("null")) {
                damage = 45;
            } else {
                damage = Integer.parseInt(stats[2]);
            }

            int health;
            if (stats[3].equals("null")) {
                health = 250;
            } else {
                health = Integer.parseInt(stats[3]);
            }

            int armor;
            if (stats[4].equals("null")) {
                armor = 10;
            } else {
                armor = Integer.parseInt(stats[4]);
            }

            if (typeNameAndStats.containsKey(type) && typeNameAndStats.get(type).containsKey(name)){
              typeNameAndStats.put(type, new TreeMap<>());
              typeNameAndStats.get(type).put(name,new int[]{damage,health,armor});
            }

                typeNameAndStats.putIfAbsent(type, new TreeMap<>());
                typeNameAndStats.get(type).putIfAbsent(name, new int[]{damage, health, armor});




        }

//{Type}::({damage}/{health}/{armor})
        typeNameAndStats.forEach((key, value) -> {

            String[] names = value.keySet().toArray(new String[0]);

            double avDamage = 0;
            double avHealth = 0;
            double avArmor = 0;

            for (int i = 0; i < names.length ; i++) {
                String dragonName = names[i];
                avDamage += value.get(dragonName)[0];
                avHealth += value.get(dragonName)[1];
                avArmor += value.get(dragonName)[2];
            }

            avDamage/=names.length;
            avHealth/=names.length;
            avArmor/=names.length;

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, avDamage, avHealth,avArmor);

            Map<String, int[]> nameAndStats = value;

            nameAndStats.forEach((key2, value2) -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", key2, value2[0], value2[1], value2[2]);

            });
        });


    }
}