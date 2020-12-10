import java.util.Scanner;
// РЕШЕНО - 100/100
public class Ex06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int cakePieces = cakeLength * cakeWidth;
        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int currentCakePieces = Integer.parseInt(input);
            cakePieces -= currentCakePieces;
            if (cakePieces < 0) {
                break;

            }

            input = scanner.nextLine();
        }
if (cakePieces <0) {
    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
} else {
    System.out.printf("%d pieces are left.", cakePieces);
}
    }
}
