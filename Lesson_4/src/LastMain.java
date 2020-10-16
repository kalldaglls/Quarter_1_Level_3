import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LastMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printA();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printB();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printC();
            }
        });

        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.shutdown();

    }
}
