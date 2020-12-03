import java.util.Scanner;
// 100 / 100
public class Task4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short squareArea = scanner.nextShort();


        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, squareArea);





    }
}
