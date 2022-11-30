import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
        kiosk.addMenuItem("Coffee", 1.45);
        kiosk.addMenuItem("Mocha", 3.45);
        kiosk.addMenuItem("Cappuccino", 4.45);
        kiosk.addMenuItem("Latte", 5.15);

        kiosk.display();
        kiosk.newOrder();
    }
}
