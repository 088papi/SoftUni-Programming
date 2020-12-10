import java.util.Scanner;

public class Ex05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// 100/100 РЕШЕНО
    
        double moneInput = Double.parseDouble(scanner.nextLine());
        // 2,1,0.50,0.20,0.10,0.05,0.02,0.01 - монети/лева  ===> преобразуване на мерната единица за пари
        // 200, 100, 50, 20, 10, 5, 2, - стотинки
        int money = (int) (moneInput * 100);
        //1.23 = 12 stotink;

        int coinsCount = 0;
        while (money > 0) {
            if (money >= 200) {
                money -= 200;
                coinsCount++;
            } else if (money >= 100) {
                money -= 100;
                coinsCount++;
            } else if (money >= 50) {
                money -= 50;
                coinsCount++;
            } else if (money >= 20) {
                money -= 20;
                coinsCount++;
            } else if (money >= 10) {
                money -= 10;
                coinsCount++;
            } else if (money >= 5) {
                money -= 5;
                coinsCount++;
            } else if (money >= 2) {
                money -= 2;
                coinsCount++;
            } else if (money >= 1) {
                money -= 1;
                coinsCount++;
            }


        }
        System.out.println(coinsCount);
    }
}