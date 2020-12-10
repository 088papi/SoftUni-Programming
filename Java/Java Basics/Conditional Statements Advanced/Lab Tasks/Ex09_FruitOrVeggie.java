import java.util.Scanner;
// 100/100
public class Ex09_FruitOrVeggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        switch (fruit) {
            case "banana":
                System.out.println("fruit");
                break;
            case "apple":
                System.out.println("fruit");
                break;
            case "kiwi":
                System.out.println("fruit");
                break;
            case "cherry":
                System.out.println("fruit");
                break;
            case "lemon":
                System.out.println("fruit");
                break;
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
                System.out.println("vegetable");
                break;
            case "cucumber":
                System.out.println("vegetable");
                break;
            case "pepper":
                System.out.println("vegetable");
                break;
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
