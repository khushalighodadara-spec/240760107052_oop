import java.util.Scanner;

class Time {
    int hours;
    int minutes;

    // Method to set time
    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    // Method to display time
    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    // Method to add two Time objects
    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        // Adjust minutes if greater than 60
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        // Input for first time
        System.out.print("Enter hours and minutes for Time 1: ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        t1.setTime(h1, m1);

        // Input for second time
        System.out.print("Enter hours and minutes for Time 2: ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        t2.setTime(h2, m2);

        // Add times
        result.addTime(t1, t2);

        // Display result
        System.out.print("Total Time: ");
        result.displayTime();

        sc.close();
    }
}
