import java.util.Scanner;
//РЕШЕНО - ПРОВЕРИ В ДЖЪДЖ / 100/100
public class Ex10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
//Дадено число е валидно, ако е в диапазона [100…200] или е 0.
// Да се напише програма, която чете цяло число, въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.
        if (number < 100 && number != 0 || number > 200 ) {
            System.out.println("invalid");
        }
    }
}
