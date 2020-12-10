import java.util.Scanner;

// РЕШЕНА - 100/100
public class Ex07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = numberNights * 50;
                priceApartment = numberNights * 65;

                if (numberNights <= 7) {
                    priceStudio = numberNights * 50;
                    priceApartment = numberNights * 65;
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else if (numberNights > 7 && numberNights <= 14) {
                    priceStudio = priceStudio - 0.05 * priceStudio;
                    priceApartment = numberNights * 65;
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else if (numberNights > 14) {
                    priceStudio = priceStudio - 0.3 * priceStudio;
                    priceApartment = priceApartment - 0.1 * priceApartment;
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;

            case "June":
            case "September":
                priceStudio = numberNights * 75.20;
                priceApartment = numberNights * 68.70;
                if (numberNights > 14) {
                    priceStudio = priceStudio - (0.20 * priceStudio);
                    priceApartment = priceApartment - (0.1 * priceApartment);
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else {
                    priceStudio = numberNights * 75.20;
                    priceApartment = numberNights * 68.70;
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;

            case "July":
            case "August":
                priceStudio = numberNights * 76;
                priceApartment = numberNights * 77;
                if (numberNights > 14) {
                    priceStudio = numberNights * 76;
                    priceApartment = priceApartment - 0.1 * priceApartment;
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;


        }

    }
}
