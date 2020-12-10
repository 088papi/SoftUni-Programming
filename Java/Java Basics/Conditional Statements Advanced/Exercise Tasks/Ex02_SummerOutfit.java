import java.util.Scanner;
// 100/100
public class Ex02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (10 <= degrees && degrees <= 18) {
            switch (dayTime) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;


                //18 < градуси <= 24
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if (18 <= degrees && degrees <= 24) {
            switch (dayTime) {
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if (degrees >= 25) {
            switch (dayTime) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            } System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);


        }
    }
}

