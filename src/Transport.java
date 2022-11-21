import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;

    private final double engineVolume;

    private String bestLapTime;

    private int maxSpeed;

    private static final String DEFAULT_VALUE = "default";

    private final Set<Transport> allTransportList = new HashSet<>();
    private final Set<Driver<?>> allDriverList = new HashSet<>();

    private final Set<Sponsor> allSponsorList = new HashSet<>();

    private final Set<Mechanic<?>> allMechanicList = new HashSet<>();

    public Transport(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.engineVolume = engineVolume > 0 ? engineVolume : 2;
        setBestLapTime(bestLapTime);
        setMaxSpeed(maxSpeed);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract void doDiagnistics();

    public abstract void repair();

    public void addDriver(Driver<?> driver) {
        allDriverList.add(driver);
    }

    public void addSponsor(Sponsor... sponsors) {
        this.allSponsorList.addAll(Arrays.asList(sponsors));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.allMechanicList.addAll(Arrays.asList(mechanics));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDefault(brand, DEFAULT_VALUE);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDefault(model, DEFAULT_VALUE);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(String bestLapTime) {
        this.bestLapTime = ValidationUtils.validOrDefault(bestLapTime, DEFAULT_VALUE);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 150;
    }

    public Set<Transport> getAllTransportList() {
        return allTransportList;
    }

    public Set<Driver<?>> getAllDriverList() {
        return allDriverList;
    }

    public Set<Sponsor> getAllSponsorList() {
        return allSponsorList;
    }

    public Set<Mechanic<?>> getAllMechanicList() {
        return allMechanicList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
