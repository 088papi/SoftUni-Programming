public class BankAccount {
    private static int count = 1;
    private static double interestRate = 0.02;


    private int id;
    private double balance;


    public BankAccount() {
        this.id = count;
        count++;
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return years * interestRate * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }


}
