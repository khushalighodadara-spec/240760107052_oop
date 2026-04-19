class SumThread extends Thread {
    private int start, end;
    private long sum = 0;
    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }
    public long getSum() {
        return sum;
    }
}

public class ThreadSumDemo {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        long total = t1.getSum() + t2.getSum();

        System.out.println("Final Sum from 1 to 2000 = " + total);
    }
}

/*
Sample Output:

Sum from 1 to 1000 = 500500
Sum from 1001 to 2000 = 1500500
Final Sum from 1 to 2000 = 2001000
*/
