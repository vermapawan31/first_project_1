package Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecuterServiceMain {

    public static void main(String[] args) {
      //  ExecutorService es= Executors.newSingleThreadExecutor();
        ExecutorService es= Executors.newFixedThreadPool(2);

        es.execute(new Thread1());
        es.execute(new Thread2());
    }
}
