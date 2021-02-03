package Task1_SantasPresentFactory;

import java.util.*;


public class Task1_SantasPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] materialsInput = readArray(scanner);
        int[] magicLevelInput = readArray(scanner);

        Map<String, Integer> presents = new TreeMap<>();

        ArrayDeque<Integer> materialsStack = new ArrayDeque<>();

        for (int j : materialsInput) {
            materialsStack.push(j);
        }

        ArrayDeque<Integer> magicLevelQueue = new ArrayDeque<>();
        for (int j : magicLevelInput) {
            magicLevelQueue.offer(j);
        }


        while (true) {
            if (materialsStack.isEmpty()) {
                break;
            } else if (magicLevelQueue.isEmpty()) {
                break;
            }

            int material = materialsStack.peek();
            int magicLevel = magicLevelQueue.peek();
            int product = 0;

            if (material == 0) {
                materialsStack.pop();
            }
            if (magicLevel == 0) {
                magicLevelQueue.poll();
            }

            product = material * magicLevel;
            if (product < 0) {
                removeMagicValueAndIncreaseMaterial(materialsStack, magicLevelQueue, material, magicLevel);
            } else if (product > 0) {

                addPresent(presents, materialsStack, magicLevelQueue, material, product);

            }
        }


        checkPresentsAndPrintResult(presents, materialsStack, magicLevelQueue);


    }

    private static void addPresent(Map<String, Integer> presents, ArrayDeque<Integer> materialsStack, ArrayDeque<Integer> magicLevelQueue, int material, int product) {
        switch (product) {
            case 150:
                presents.putIfAbsent("Doll", 0);
                presents.put("Doll", presents.get("Doll") + 1);
                materialsStack.pop();
                magicLevelQueue.poll();
                break;
            case 250:
                presents.putIfAbsent("Wooden train", 0);
                presents.put("Wooden train", presents.get("Wooden train") + 1);
                materialsStack.pop();
                magicLevelQueue.poll();
                break;
            case 300:
                presents.putIfAbsent("Teddy bear", 0);
                presents.put("Teddy bear", presents.get("Teddy bear") + 1);
                materialsStack.pop();
                magicLevelQueue.poll();
                break;
            case 400:
                presents.putIfAbsent("Bicycle", 0);
                presents.put("Bicycle", presents.get("Bicycle") + 1);
                materialsStack.pop();
                magicLevelQueue.poll();
                break;
            default:
                magicLevelQueue.poll();
                materialsStack.poll();
                material += 15;
                materialsStack.push(material);
                break;
        }
    }

    private static void removeMagicValueAndIncreaseMaterial(ArrayDeque<Integer> materialsStack, ArrayDeque<Integer> magicLevelQueue, int material, int magicLevel) {
        int product;
        product = material + magicLevel;
        materialsStack.pop();
        magicLevelQueue.poll();
        materialsStack.push(product);
    }

    private static void checkPresentsAndPrintResult(Map<String, Integer> presents, ArrayDeque<Integer> materialsStack, ArrayDeque<Integer> magicLevelQueue) {
        String join = String.join(", ", materialsStack.toString().substring(1, materialsStack.toString().length() - 1));
        String join1 = String.join(", ", magicLevelQueue.toString().substring(1, magicLevelQueue.toString().length() - 1));
        if ((presents.containsKey("Doll") && presents.containsKey("Train"))
                || (presents.containsKey("Bicycle") && presents.containsKey("Teddy bear"))) {
            System.out.println("The presents are crafted! Merry Christmas!");
            if (!materialsStack.isEmpty()) {
                System.out.print("Materials left: ");
                System.out.println(join);
            }
            if (!magicLevelQueue.isEmpty()) {
                System.out.print("Magic left: ");
                System.out.println(join1);
            }
            presents.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));

        } else {
            System.out.println("No presents this Christmas!");
            if (!materialsStack.isEmpty()) {
                System.out.print("Materials left: ");
                System.out.println(join);
            }
            if (!magicLevelQueue.isEmpty()) {
                System.out.print("Magic left: ");
                System.out.println(join1);
            }
            presents.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}

