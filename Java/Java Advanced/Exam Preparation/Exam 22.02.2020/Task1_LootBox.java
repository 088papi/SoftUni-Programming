import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = readArray(scanner);
        int[] second = readArray(scanner);

        ArrayDeque<Integer> firstLootBoxQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondLootBoxStack = new ArrayDeque<>();
        for (int j : first) {
            firstLootBoxQueue.offer(j);
        }

        for (int i : second) {
            secondLootBoxStack.push(i);
        }

            int claimedItems = 0;
        while (true){
            if (firstLootBoxQueue.isEmpty()){
                System.out.println("First lootbox is empty");
                break;
            }
            if (secondLootBoxStack.isEmpty()){
                System.out.println("Second lootbox is empty");
                break;
            }

        int sum = firstLootBoxQueue.peek() + secondLootBoxStack.peek();

            if (sum % 2 == 0){
                claimedItems+=sum;
                secondLootBoxStack.pop();
                firstLootBoxQueue.poll();
            } else {
                firstLootBoxQueue.offer(secondLootBoxStack.pop());
            }
        }


        if (claimedItems >= 100){
            System.out.println("Your loot was epic! Value: " + claimedItems);
        } else {
            System.out.println("Your loot was poor... Value: " + claimedItems);
        }


    }

    public static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
