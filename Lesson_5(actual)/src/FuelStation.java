import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class FuelStation {
    private CountDownLatch countDownLatch;
    private Semaphore semaphore;

    public FuelStation(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public float reFuel (float newFuel) {
        try {
            semaphore.acquire();
            return newFuel;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
