package threadexample;

public class DemoThread {

    public static void main(String[] args) {

        // Initialize thread properly before calling getName()
        Thread thj = new Thread(() -> {
            System.out.println("Thread thj is running...");
        });
        thj.start(); // Start the thread

        // Now it's safe to call getName() because the thread is initialized
        System.out.println(thj.getName());

        // Thread1 and Thread2 are custom threads that extend the Thread class
        Thread1 thj1 = new Thread1();
        thj1.start();

        Thread2 th = new Thread2();
        th.start();
    }
}
