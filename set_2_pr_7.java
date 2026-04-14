import java.util.Scanner;

class LoanCalculator {

    // Home Loan EMI
    void calculateEMI(int principal, int time, float rate) {
        float r = rate / (12 * 100); // monthly interest rate
        int n = time * 12; // months

        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Home Loan EMI: Rs." + emi);
    }

    // Vehicle Loan EMI
    void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Vehicle Loan EMI: Rs." + emi);
    }

    // Personal Loan EMI (fixed 10% interest)
    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Personal Loan EMI (10% fixed): Rs." + emi);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator lc = new LoanCalculator();

        // Home Loan
        System.out.print("Enter Home Loan Principal, Time (years), Rate: ");
        int p1 = sc.nextInt();
        int t1 = sc.nextInt();
        float r1 = sc.nextFloat();
        lc.calculateEMI(p1, t1, r1);

        // Vehicle Loan
        System.out.print("\nEnter Vehicle Loan Principal, Time (years), Rate: ");
        double p2 = sc.nextDouble();
        int t2 = sc.nextInt();
        double r2 = sc.nextDouble();
        lc.calculateEMI(p2, t2, r2);

        // Personal Loan
        System.out.print("\nEnter Personal Loan Principal and Time (years): ");
        int p3 = sc.nextInt();
        int t3 = sc.nextInt();
        lc.calculateEMI(p3, t3);

        sc.close();
    }
}
