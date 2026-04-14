import java.util.Scanner;

// Superclass
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment...");
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card");
    }
}

// Subclass 2
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        Payment p; // reference of superclass

        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Method overriding (runtime polymorphism)
        p.processPayment(amount);

        sc.close();
    }
}
