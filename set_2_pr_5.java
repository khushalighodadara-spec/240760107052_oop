import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    // Method to assign values
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    // Method to display values
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
        System.out.println("---------------------------");
    }

    // Static search method
    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAccount not found!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of 5 BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        // Input details
        for (int i = 0; i < 5; i++) {
            accounts[i] = new BankAccount();

            System.out.println("Enter details for Account " + (i + 1) + ":");

            System.out.print("Account ID: ");
            String id = sc.next();

            sc.nextLine(); // consume newline

            System.out.print("Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();

            accounts[i].assignValues(id, name, balance);
            System.out.println();
        }

        // Display all accounts
        System.out.println("\n--- All Account Details ---");
        for (int i = 0; i < 5; i++) {
            accounts[i].displayValues();
        }

        // Search for an account
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.next();

        BankAccount.searchAccount(accounts, searchId);

        sc.close();
    }
}
