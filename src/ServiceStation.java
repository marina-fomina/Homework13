import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final String stationName;
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    private static final String DEFAULT_VALUE = "default";

    public ServiceStation(String stationName) {
        this.stationName = ValidationUtils.validOrDefault(stationName, DEFAULT_VALUE);
    }

    public void addToTransportQueue(Car car) {
        transportQueue.offer(car);
    }

    public void addToTransportQueue(Truck truck) {
        transportQueue.offer(truck);
    }

    public void service() {
        if (!transportQueue.isEmpty()) {
            Transport next = transportQueue.poll();
            System.out.println("Автомобиль " + next.getBrand() + " " + next.getModel() + " прошёл тех. обслуживание.");
        }
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }
}
