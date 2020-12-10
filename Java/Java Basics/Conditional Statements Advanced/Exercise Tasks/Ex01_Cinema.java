import java.util.Scanner;
//100/100
public class Ex01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
double totalPrice = 0;
        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        //. Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.

        switch (typeProjection) {
            case "Premiere":
                totalPrice = columns * rows * 12.00;
                System.out.printf("%.2f leva", totalPrice);
                break;
            case "Normal":
                totalPrice = columns * rows * 7.5;
                System.out.printf("%.2f leva", totalPrice);
                break;
            case "Discount":
                totalPrice = columns * rows * 5.00;
                System.out.printf("%.2f leva", totalPrice);
                break;
        }
    }
}
