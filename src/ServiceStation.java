import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private String stationName;
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    private static final String DEFAULT_VALUE = "default";

    public ServiceStation(String stationName) {
        this.stationName = ValidationUtils.validOrDefault(stationName, DEFAULT_VALUE);
    }

    private void addToQueue(Transport transport) {
        transportQueue.offer(transport);
    }

    public void addCarToQueue(Car car) {
        transportQueue.offer(car);
    }

    public void addTruckToQueue(Truck truck) {
        transportQueue.offer(truck);
    }

    public void service() {
        if (!transportQueue.isEmpty()) {
            Transport transport = transportQueue.poll();
            System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " прошёл тех. обслуживание.");
        }
    }

    public String getStationName() {
        return stationName;
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }
}
