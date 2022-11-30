public class Launcher {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.getTotalAccountValue());
        System.out.println(account1.addChecking(5000));
        System.out.println(account1.addSavings(2500));
        System.out.println(account1.getTotalAccountValue());

        BankAccount account2 = new BankAccount();
        System.out.println(account2.addChecking(5000));
        System.out.println(account2.addSavings(10000));
        System.out.println(account2.getTotalAccountValue());
        System.out.println(account2.subChecking(7000));
        System.out.println(account2.subSavings(1000));
        System.out.println(account2.getTotalAccountValue());
    }
}