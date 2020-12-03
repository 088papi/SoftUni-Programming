import java.math.BigDecimal;
import java.util.Scanner;
//100/100
public class Task10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        BigDecimal halfN = new BigDecimal(N / 2.0);
        while (N >= M) {
            N -= M;
            pokeCounter++;

            if (halfN.compareTo(BigDecimal.valueOf(N)) == 0) {
                if (N > Y && Y != 0) {
                    N = N / Y;
                }
            }
        }
        System.out.println(N);
        System.out.println(pokeCounter);
    }
}
