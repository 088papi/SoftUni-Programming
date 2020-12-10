import java.util.Scanner;
// 100/100 
public class Ex06_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabsCount = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < tabsCount; i++) {
            String websiteName = scanner.nextLine();

            if (websiteName.equals("Facebook")) {
                salary = salary - 150;
            } else if (websiteName.equals("Instagram")) {
                salary = salary - 100;
            } else if (websiteName.equals("Reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0) {
                break;
            }

        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);

        }
    }
}
