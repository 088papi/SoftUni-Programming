import java.util.Scanner;

public class Ex08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int numMax = Integer.MIN_VALUE;
        int numMIn = Integer.MAX_VALUE;

        for (int i = 0; i < number ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if(currentNum > numMax) {
                numMax = currentNum;

            }
            if (currentNum < numMIn) {
                numMIn = currentNum;

            }

        }
        System.out.printf("Max number: %d%n", numMax );
        System.out.printf("Min number: %d%n", numMIn);
    }
}
