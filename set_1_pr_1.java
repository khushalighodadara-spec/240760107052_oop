import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to be dispensed: ");
        int amount = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        System.out.println("\nCurrency notes distribution:");

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " x " + count);
                amount = amount % notes[i];
            }
        }

        sc.close();
    }
}
