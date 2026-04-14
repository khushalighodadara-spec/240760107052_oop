import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        // Input validation
        if (num < 10000 || num > 99999) {
            System.out.println("Invalid input! Please enter exactly a five-digit number.");
        } else {
            int result = 0;
            int place = 1;

            // Process each digit
            while (num > 0) {
                int digit = num % 10;

                digit = digit + 1;

                // Handle case when digit becomes 10
                if (digit == 10) {
                    digit = 0;
                }

                result = result + (digit * place);
                place = place * 10;

                num = num / 10;
            }

            System.out.println("New number: " + result);
        }

        sc.close();
    }
}
