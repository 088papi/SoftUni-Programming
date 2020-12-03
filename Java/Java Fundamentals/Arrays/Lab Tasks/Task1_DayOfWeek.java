import java.util.Scanner;
//100/100
public class Task1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int day = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = new String[] {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if (day >= 1 && day <= 7) {
            System.out.println(daysOfWeek[day - 1]);
    } else {
            System.out.println("Invalid day!");
        }








    }
}
