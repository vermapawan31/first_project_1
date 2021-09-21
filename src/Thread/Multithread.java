package Thread;

public class Multithread {

    public static void main(String[] args) throws InterruptedException {

        Thread2 t2 = new Thread2();
        t2.start();
        Thread3 t3 = new Thread3();
        t3.join();
        t3.start();
        Thread1 t1 = new Thread1();
        t1.start();
      //  t1.setPriority(10);
        //®t2.setPriority(1);






    }
}
