public class Ex01_NumbersEndingIn7 {
    public static void main(String[] args) {
        // РЕШЕНО - 100/100 

        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}