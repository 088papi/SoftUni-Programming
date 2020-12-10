import java.util.Scanner;

public class Ex04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;
        int targetSteps = 10000;
        while (sumSteps < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int currentSteps = Integer.parseInt(scanner.nextLine());
                sumSteps += currentSteps;
                break;
            }
            sumSteps += Integer.parseInt(input);
        }
        if (sumSteps >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(sumSteps - 10000));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(sumSteps - targetSteps));

        }
    }
}
