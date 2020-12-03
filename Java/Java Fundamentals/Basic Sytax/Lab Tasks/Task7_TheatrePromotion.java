import java.util.Scanner;
//100/100
public class Task7_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice;

        switch (dayType) {
            case "Weekday":
                if (0 <= age && age  <= 18) {
                    ticketPrice = 12;
                    System.out.println(ticketPrice + "$");
                } else if (18 < age && age <= 64) {
                    ticketPrice = 18;
                    System.out.println(ticketPrice + "$");
                } else if (64 < age  && age <= 122) {
                    ticketPrice = 12;
                    System.out.println(ticketPrice + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (0 <= age && age  <= 18) {
                    ticketPrice = 15;
                    System.out.println(ticketPrice + "$");
                } else if (18 < age && age <= 64) {
                    ticketPrice = 20;
                    System.out.println(ticketPrice + "$");
                } else if (64 < age  && age <= 122) {
                    ticketPrice = 15;
                    System.out.println(ticketPrice + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (0 <= age && age  <= 18) {
                    ticketPrice = 5;
                    System.out.println(ticketPrice + "$");
                } else if (18 < age && age <= 64) {
                    ticketPrice = 12;
                    System.out.println(ticketPrice + "$");
                } else if (64 < age  && age <= 122) {
                    ticketPrice = 10;
                    System.out.println(ticketPrice + "$");
                }else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");

        }



    }
}
