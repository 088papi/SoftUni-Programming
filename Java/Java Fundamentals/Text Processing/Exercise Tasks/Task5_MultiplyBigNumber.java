import com.sun.jdi.LongValue;
//100/100
import java.util.Scanner;

public class Task5_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fistNum = scanner.nextLine().replaceFirst("^0+","");
        int secondNum = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        int carry = 0;

     if (secondNum == 0) {
         System.out.println(0);
         return;
     }

        for (int i = fistNum.length()-1; i >= 0 ; i--) {
            int digit = Integer.parseInt(String.valueOf(fistNum.charAt(i)));
            int result = digit * secondNum + carry;


            if (i == 0) {
                sb.insert(0,result);
            } else {
                int resDigit = result%10;
                carry = result/10;
                sb.insert(0,resDigit);
            }


        }

        System.out.println(sb);



    }
}
