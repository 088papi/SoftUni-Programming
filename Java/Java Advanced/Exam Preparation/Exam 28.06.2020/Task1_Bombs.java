package task1;

import java.util.*;

public class Task1_Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> bombs = new TreeMap<>();
        bombs.put("Datura Bombs", 0);
        bombs.put("Cherry Bombs", 0);
        bombs.put("Smoke Decoy Bombs", 0);

        int[] bombEffects = readArray(scanner);
        int[] bombCasling = readArray(scanner);

        Deque<Integer> bombEffectsQueue = new ArrayDeque<>();
        for (int i = 0; i < bombEffects.length; i++) {
            bombEffectsQueue.offer(bombEffects[i]);
        }

        Deque<Integer> bombCaslingStack = new ArrayDeque<>();

        for (int i = 0; i < bombCasling.length; i++) {
            bombCaslingStack.push(bombCasling[i]);
        }


        byte daturaCounter = 0;
        byte cherryCounter = 0;
        byte smokeCounter = 0;

        do {

            if (bombCaslingStack.isEmpty() || bombEffectsQueue.isEmpty()){
                break;
            }


            int effect = bombEffectsQueue.peek();
            int casling = bombCaslingStack.peek();
            int sum = effect + casling;
            switch (sum) {
                case 40:
                    bombs.put("Datura Bombs", bombs.get("Datura Bombs") + 1);
                    bombCaslingStack.pop();
                    bombEffectsQueue.poll();
                    daturaCounter++;
                    break;
                case 60:
                    bombs.put("Cherry Bombs", bombs.get("Cherry Bombs") + 1);
                    bombCaslingStack.pop();
                    bombEffectsQueue.poll();
                    cherryCounter++;
                    break;
                case 120:
                    bombs.put("Smoke Decoy Bombs", bombs.get("Smoke Decoy Bombs") + 1);
                    bombCaslingStack.pop();
                    bombEffectsQueue.poll();
                    smokeCounter++;
                    break;
                default:
                    casling -= 5;
                    bombCaslingStack.pop();
                    bombCaslingStack.push(casling);

                    break;
            }


            if (daturaCounter >= 3 && cherryCounter >=3 && smokeCounter >= 3){
                break;
            }
        } while (!(bombCaslingStack.isEmpty()) || !(bombEffectsQueue.isEmpty()));


        if (daturaCounter >= 3 && cherryCounter >= 3 && smokeCounter >= 3){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        String substring = "";

        if (bombEffectsQueue.isEmpty()){
            System.out.println("Bomb Effects: empty");
        } else {
            System.out.print("Bomb Effects: ");
            substring = bombEffectsQueue.toString().substring(1, bombEffectsQueue.toString().length()-1);
            System.out.println(substring);
        }

        if (bombCaslingStack.isEmpty()){
            System.out.println("Bomb Casings: empty");
        } else {
            System.out.print("Bomb Casings: ");
            substring = bombCaslingStack.toString().substring(1, bombCaslingStack.toString().length() - 1);
            System.out.println(substring);
        }
        bombs.forEach((name, count) ->{
            System.out.printf("%s: %d%n", name,count);
        });







        System.out.println();

    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
