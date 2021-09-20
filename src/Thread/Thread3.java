package Thread;

public class Thread3 extends Thread {
    public void run() {
        System.out.println("thread3 started");
        for (int i = 200; i <= 300; i++) {
            System.out.print(i+" ");
        }
        System.out.println("thread3 ended");
    }
}
