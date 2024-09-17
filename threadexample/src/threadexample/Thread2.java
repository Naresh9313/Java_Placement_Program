package threadexample;  // Make sure this matches the package structure

public class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2 is running...");
    }
}
