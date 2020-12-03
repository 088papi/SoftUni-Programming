import java.util.Scanner;
// 100/100 - може да я пререшиш заради факториела
public class Task6_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String inputNum = scanner.nextLine();
int sum = 0;

        for (int i = 0; i < inputNum.length(); i++) {
            int digit = inputNum.charAt(i) - 48;
            int factoriel = 1;
            for (int j = 1; j <= digit ; j++) {

                factoriel *= j;
            }
            sum += factoriel;
        }
            int num = Integer.parseInt(inputNum);
            if (sum == num) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }



    }
}
