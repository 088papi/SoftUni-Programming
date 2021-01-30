import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (!input.equals("End")) {
            String output = null;
            String[] data = input.split("\\s+");
            int id;
            switch (data[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    output = "Account ID" + account.getId() + " created";
                    break;
                case "Deposit":
                    id = Integer.parseInt(data[1]);
                    if (accounts.containsKey(id)) {
                        accounts.get(id).deposit(Integer.parseInt(data[2]));
                        output = "Deposited " + Integer.parseInt(data[2]) + " to ID" + id;
                    } else {
                        output = "Account does not exist";
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(data[1]));
                    output = null;
                    break;
                case "GetInterest":
                    id = Integer.parseInt(data[1]);
                    if (accounts.containsKey(id)) {
                        double interest = accounts.get(id).getInterest(Integer.parseInt(data[2]));
                        output = String.format("%.2f", interest);
                        break;
                    } else {
                        output = "Account does not exist";
                    }
            }
            if (output != null) {
                System.out.println(output);
            }


            input = scanner.nextLine();
        }


    }
}
