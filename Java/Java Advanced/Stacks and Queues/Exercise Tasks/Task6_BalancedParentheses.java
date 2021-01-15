import java.util.ArrayDeque;
import java.util.Scanner;

public class Task6_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isBalanced = false;

        ArrayDeque<String> parenthesesStack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("");

        for (int i = 0; i < input.length; i++) {

            if (input[i].equals("(")){
                parenthesesStack.push(input[i]);
            } else if (input[i].equals(")") && parenthesesStack.contains("(")){
                parenthesesStack.pop();
            } else if (input[i].equals(")")){
                parenthesesStack.push(input[i]);
            }

            if (input[i].equals("[")){
                parenthesesStack.push(input[i]);
            } else if (input[i].equals("]") && parenthesesStack.contains("[")){
                parenthesesStack.pop();
            }else if (input[i].equals("]")){
                parenthesesStack.push(input[i]);
            }

            if (input[i].equals("{")){
                parenthesesStack.push(input[i]);
            } else if (input[i].equals("}") && parenthesesStack.contains("{")){
                parenthesesStack.pop();
            }else if (input[i].equals("}")){
                parenthesesStack.push(input[i]);
            }
        }

        if (parenthesesStack.isEmpty()){
            isBalanced = true;
        }










        if (isBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    }

