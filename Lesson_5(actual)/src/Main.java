import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        FuelStation fuelStation = new FuelStation(semaphore);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 3 ; i++) {
            executorService.submit(
                    new Bus("Bus #" + i, fuelStation)
            );
        }

        for (int i = 0; i < 3 ; i++) {
            executorService.submit(
                    new Car("Car #" + i, fuelStation)
            );
        }

        for (int i = 0; i < 3 ; i++) {
            executorService.submit(
                    new Truck("Truck #" + i, fuelStation)
            );
        }

        executorService.shutdown();

    }
}
