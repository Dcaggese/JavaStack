import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {

        Item item1 = new Item("Coffee", 1.45);
        Item item2 = new Item("Mocha", 3.45);
        Item item3 = new Item("Cappuccino", 4.45);
        Item item4 = new Item("Latte", 5.15);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Dom");
        Order order4 = new Order("John");
        Order order5 = new Order("Jane");

        System.out.println(order4.getName());
        System.out.println(item3.getPrice());

        order3.additem(item1);
        order3.additem(item1);

        order4.additem(item2);
        order4.additem(item4);

        order5.additem(item2);
        order5.additem(item3);

        System.out.println(order3.getStatusMessage());
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        System.out.println(order3.getOrderTotal(order3.getItems()));

        order3.display();
    }
}
