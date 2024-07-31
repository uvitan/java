class SavingsAccount {
    private static double annualInterestRate; // Static variable for the annual interest rate
    private double savingsBalance;            // Instance variable for the balance

    // Constructor to initialize savings balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate and add monthly interest to the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class SavingsAccountTest {
    public static void main(String[] args) {
        // Create two savings account objects with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate the monthly interest and print new balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after interest: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after interest: Rs %.2f%n", saver2.getSavingsBalance());

        // Set the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate the next month's interest and print new balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after interest: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after interest: Rs %.2f%n", saver2.getSavingsBalance());
    }
}
