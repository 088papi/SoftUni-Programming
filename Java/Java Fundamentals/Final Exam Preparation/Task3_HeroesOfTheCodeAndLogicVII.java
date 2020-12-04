import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//100/100
public class Task3_HeroesOfTheCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroHP = new LinkedHashMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();
        int heroNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < heroNumber; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String heroName = data[0];
            int HP = Integer.parseInt(data[1]);
            int MP = Integer.parseInt(data[2]);

            if (HP <= 100 && MP <= 200) {
                heroHP.put(heroName, HP);
                heroMP.put(heroName, MP);
            }
        }

        while (true) {
            String input2 = scanner.nextLine();
            if (input2.equals("End")) {
                break;
            }
            String[] data = input2.split(" - ");
            String command = data[0];
            String heroName = data[1];

            switch (command) {
                case "CastSpell":
                    int MPNeeded = Integer.parseInt(data[2]);
                    String spellName = data[3];

                    if (heroMP.get(heroName) >= MPNeeded) {
                        int MPLeft = heroMP.get(heroName) - MPNeeded;
                        heroMP.put(heroName, heroMP.get(heroName) - MPNeeded);
                        System.out.printf("%s has successfully cast %s and now has %s MP!%n", heroName, spellName, MPLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    int currentHP = heroHP.get(heroName) - damage;
                    heroHP.put(heroName, heroHP.get(heroName) - damage);

                    if (heroHP.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroHP.remove(heroName);
                        heroMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int MPGivenAmount = Integer.parseInt(data[2]);
                    int currentMana = heroMP.get(heroName);
                    if (currentMana <= 200) {
                        int allMana = currentMana + MPGivenAmount;

                        int rechargedMana = 0;

                        if (allMana <= 200) {
                            heroMP.put(heroName, allMana);
                             rechargedMana = MPGivenAmount;
                        } else {
                            heroMP.put(heroName, 200);
                             rechargedMana = 200 - currentMana;
                        }
                        System.out.printf("%s recharged for %d MP!%n", heroName, rechargedMana);
                    }

                    break;
                case "Heal":
                    int HPGivenAmount = Integer.parseInt(data[2]);
                    int currentHealth = heroHP.get(heroName);

                    if (currentHealth <= 100) {
                        int allHealth = currentHealth + HPGivenAmount;
                        int rechargedHealth = 0;

                        if (allHealth <= 100) {
                            heroHP.put(heroName, allHealth);
                            rechargedHealth = HPGivenAmount;
                        } else {
                            heroHP.put(heroName, 100);
                            rechargedHealth = 100 - currentHealth;
                        }

                        System.out.printf("%s healed for %s HP!%n", heroName, rechargedHealth);
                        break;
                    }
            }
        }

        heroHP.entrySet()
                .stream()
                .sorted((a,b) -> a.getKey().compareTo(b.getKey()))
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.printf("%s%n  HP: %d%n  MP: %d%n",e.getKey(),e.getValue(),heroMP.get(e.getKey())));

    }
}
