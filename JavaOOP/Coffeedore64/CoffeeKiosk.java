import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructors
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>(); 
    }
    
    //Getters
    public ArrayList<Item> getMenu() {
        return this.menu;
    }
    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    //Setters
    public void setMenu(Item item) {
        this.menu.add(item);
    }

    //Methods
    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        setMenu(item);
        item.setIndex(this.menu.indexOf(item));
    }

    public void display() {
        for (Order order : this.orders) {
            System.out.println("\n"+item.getIndex()+" "+ orders.getOrders()+ " -- $"+ item.getPrice());
        }
    }

        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        display();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            int i = Integer.parseInt(itemNumber);
            if(i < this.menu.size()){
                Item orderItem = menu.get(i);
                order.additem(orderItem);
            } else {
                System.out.println("sorry, we do not have that");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("please enter the index of the coffee you would like to order, or press q to exit.");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.display();
        this.orders.add(order);
        
    }
 
}