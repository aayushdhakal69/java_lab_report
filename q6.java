import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Create two threads
        Thread thread1 = new Thread(new Counter("Thread-1", number));
        Thread thread2 = new Thread(new Counter("Thread-2", number));

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Counter implements Runnable {

    private String name;
    private int number;

    public Counter(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= number; i++) {
            System.out.println(name + ": " + i);
        }
    }
}
