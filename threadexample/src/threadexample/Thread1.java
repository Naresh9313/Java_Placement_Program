package threadexample;  // Make sure this matches the package structure

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1 is running...");
    }
}
