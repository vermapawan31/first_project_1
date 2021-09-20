package Thread;

public class Thread2 extends Thread {
    public void run() {
        System.out.println("thread2 started");
        for (int i = 100; i <= 200; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("thread2 ended");
    }
}

