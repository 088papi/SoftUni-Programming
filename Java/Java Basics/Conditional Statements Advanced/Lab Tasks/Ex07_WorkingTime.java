import java.util.Scanner;
// 85/100 - ПРЕГЛЕДАЙ - ДОБАВИЛ СИ ДЕФОЛТ
public class Ex07_WorkingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        // като работното време на офисът е от 10-18 часа, от понеделник до събота включително

        if (hour >= 10 && hour < 18) {
            switch (day) {
                case "Monday":
                    System.out.println("open");
                    break;
                case "Tuesday":
                    System.out.println("open");
                    break;
                case "Wednesday":
                    System.out.println("open");
                    break;
                case "Thursday":
                    System.out.println("open");
                    break;
                case "Friday":
                    System.out.println("open");
                    break;
                case "Saturday":
                    System.out.println("open");
                    break;
                default: System.out.println("closed");
            }
        } else if (day.equals("Sunday")) {
            System.out.println("closed");
        } else {
            System.out.println("closed");
        }
    }
}
