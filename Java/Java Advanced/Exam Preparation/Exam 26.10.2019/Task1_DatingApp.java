package Task1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_DatingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] readMales = getArray(scanner);
        ArrayDeque<Integer> maleStack = new ArrayDeque<>();
        for (int male : readMales) {
            maleStack.push(male);
        }

        int[] readFemales = getArray(scanner);
        ArrayDeque<Integer> femaleQueue = new ArrayDeque<>();
        for (int female : readFemales) {
            femaleQueue.offer(female);
        }

        byte matchesCounter = 0;

        while (true) {
            if (maleStack.isEmpty()) {
                break;
            } else if (femaleQueue.isEmpty()) {
                break;
            }


            int currentMale = maleStack.peek();
            int currentFemale = femaleQueue.peek();

            if (currentMale > 0 && currentFemale > 0) {
                if (currentMale % 25 == 0 || currentFemale % 25 == 0) {
                    if (currentMale % 25 == 0) {
                        if (maleStack.size() > 1) {
                            maleStack.pop();
                            maleStack.pop();
                        } else {
                            maleStack.pop();
                        }
                    } else {
                        if (femaleQueue.size() > 1) {
                            femaleQueue.poll();
                            femaleQueue.poll();
                        } else {
                            femaleQueue.poll();
                        }
                    }
                    continue;
                }


                if (currentFemale == currentMale) {
                    maleStack.pop();
                    femaleQueue.poll();
                    matchesCounter++;

                } else {

                    femaleQueue.poll();
                    currentMale -= 2;

                    maleStack.pop();
                    maleStack.push(currentMale);
                }
            } else {
                if (currentFemale <= 0){
                    femaleQueue.poll();
                }
                if (currentMale <= 0){
                    maleStack.pop();
                }
            }

        }


        System.out.println("Matches: " + matchesCounter);

        String output = null;

        if (!maleStack.isEmpty()) {
                System.out.print("Males left: ");

                output = String.valueOf(maleStack);
                output = output.substring(1, output.length() - 1);

                System.out.println(output);

        } else {
            System.out.println("Males left: none");
        }


        if (!femaleQueue.isEmpty()) {
            System.out.print("Females left: ");

            output = String.valueOf(femaleQueue);
            output = output.substring(1, output.length() - 1);

            System.out.println(output);

        } else {
            System.out.println("Females left: none");
        }
        System.out.println();

    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
