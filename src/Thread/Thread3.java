package Thread;

public class Thread3 extends Thread {
    public void run() {
        System.out.println("thread3 started");
        for (int i = 300; i <= 400; i++) {
            System.out.print(i+" ");
        }
        System.out.println("thread3 ended");
    }
}
