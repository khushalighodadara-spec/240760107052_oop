import java.util.Scanner;

class BillGenerator {

    // Regular customer (no discount)
    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: Rs." + itemTotal);
    }

    // Privileged customer (flat discount)
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount after Rs." + discount + " discount: Rs." + finalAmount);
    }

    // Festive offer (percentage discount)
    void generateBill(int itemTotal, double discountPercent) {
        double discount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount after " + discountPercent + "% discount: Rs." + finalAmount);
    }
}

public class MallBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer Customer");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter total bill amount: ");
        int total = sc.nextInt();

        switch (choice) {
            case 1:
                bill.generateBill(total);
                break;

            case 2:
                System.out.print("Enter discount (in Rs.): ");
                int discount = sc.nextInt();
                bill.generateBill(total, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bill.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
