import java.util.Scanner;
//100/100
public class Task11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double highestSnowballValue = 0;
        double highestSnowballSnow = 0;
        double highestSnowballTime = 0;
        double highestSnowballQuality = 0;
        long snowballValue = 0;

        for (int i = 0; i < N; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = (long) Math.pow((snowballSnow/snowballTime), snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballQuality = snowballQuality;
                highestSnowballTime = snowballTime;
            }

        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality);
    }
}
