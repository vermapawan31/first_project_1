package Thread;

public class Multithread {

    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2= new Thread2();
        Thread2 t3= new Thread2();
        t1.run();
        t2.run();
        t3.run();


    }
}
