import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class with partial implementation
abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;
    protected static int idCounter = 1001;
       @Override
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = idCounter++;
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item + ", Quantity: " + qty);
    }
}

// Concrete class implementing remaining methods
class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order ID " + orderId + " has been cancelled.");
            this.item = null;
            this.qty = 0;
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    @Override
    public void generateBill() {
        if (item == null || qty == 0) {
            System.out.println("No active order to generate bill.");
            return;
        }

        int pricePerItem = 100; // fixed price for simplicity
        int total = pricePerItem * qty;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per item: Rs." + pricePerItem);
        System.out.println("Total Amount: Rs." + total);
        System.out.println("----------------");
    }
}
// Main class
public class OnlineOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        // Taking order input
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        // User choice
        System.out.println("\nChoose an option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
