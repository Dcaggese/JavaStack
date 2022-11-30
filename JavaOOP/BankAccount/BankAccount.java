public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int totalAccounts = 0;
    private static double totalAccountValue = 0;


    // Constructors
    public BankAccount() {
        totalAccounts++;
    }

    // Getters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // Setters

    // Methods
    public String addChecking(double deposit) {
        this.checkingBalance += deposit;
        totalAccountValue += deposit;
        return "You deposited: $" +deposit+ "\nYour Checking Account Balance is: $" +this.checkingBalance;
    }

    public String addSavings(double deposit) {
        this.savingsBalance += deposit;
        totalAccountValue += deposit;
        return "You deposited: $" +deposit+ "\nYour Savings Account Balance is: $" +this.savingsBalance;
    }

    public String subChecking(double withdraw) {
        if (this.checkingBalance >= withdraw) {
            this.checkingBalance -= withdraw;
            totalAccountValue -= withdraw;
            return "You deposited: $" +withdraw+ "\nYour Checking Account Balance is: $" +this.checkingBalance;
        }
        else {
            return "Insufficient funds. Your Checking Account Balance is: $" +this.checkingBalance;
        }
    }

    public String subSavings(double withdraw) {
        if (this.savingsBalance >= withdraw) {
            this.savingsBalance -= withdraw;
            totalAccountValue -= withdraw;
            return "You deposited: $" +withdraw+ "\nYour Savings Account Balance is: $" +this.savingsBalance;
        }
        else {
            return "Insufficient funds. Your Savings Account Balance is: $" +this.savingsBalance;
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double getTotalAccountValue() {
        return totalAccountValue;
    }


}