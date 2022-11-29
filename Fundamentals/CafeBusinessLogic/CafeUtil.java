import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (String item : menu) {
            System.out.println(item);
        }
        return;
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        int lineCount = customers.size();
        System.out.println(String.format("There are %o people in front of you.", lineCount));
        customers.add(userName);
        System.out.println(customers);
        return;
    }
}