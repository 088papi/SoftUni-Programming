import java.util.Scanner;
//100/100
public class Task1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int smallerFirst = findSmallerNumber(a,b);
        int smallestNumber = findSmallerNumber(smallerFirst, c);

        System.out.println(smallestNumber);

    }
    public static int findSmallerNumber(int a, int b) {
        if (a < b) {
            return a;
        }
            return b;
    }
}
