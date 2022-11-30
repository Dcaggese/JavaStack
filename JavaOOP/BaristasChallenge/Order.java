import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;


    //Constructors
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    //methods
    public void additem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready!";
        } 
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(ArrayList<Item> array) {
        double sum = 0;
        for (int i = 0; i<array.size(); i++) {
            sum += array.get(i).getPrice();
        }
        return sum;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.items);
        System.out.println(this.ready);
    }
}