import java.util.Scanner;
//100/100
public class Ex04_AgeSex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if (age >= 16 && sex.equals("m") ) {
            System.out.println("Mr.");
        } else if (age < 16 && sex.equals("m")) {
            System.out.println("Master");
        } else if (age >= 16 && sex.equals("f")) {
            System.out.println("Ms.");
        } else {
            System.out.println("Miss");
        }
    }
}
