import java.util.Scanner;
//100//100
public class Task6_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int openBracketsCounter = 0;
        int closedBracketsCounter = 0;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")){
                openBracketsCounter++;
            } else if (input.equals(")")) {
                closedBracketsCounter++;
                if (openBracketsCounter-closedBracketsCounter!=0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (openBracketsCounter==closedBracketsCounter) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
