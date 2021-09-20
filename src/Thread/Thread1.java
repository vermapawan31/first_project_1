package Thread;

public class Thread1 extends Thread {
    public void run() {
        System.out.println("thread1 started");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println("thread1 ended");
    }
}
