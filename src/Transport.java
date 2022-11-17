import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public abstract class Transport {
    private String brand;
    private String model;

    private final double engineVolume;

    private String bestLapTime;

    private int maxSpeed;

    private static final String DEFAULT_VALUE = "default";

    private ArrayList<Transport> allTransportList = new ArrayList<>();
    private LinkedList<Driver<?>> allDriverList = new LinkedList<>();

    private ArrayList<Sponsor> allSponsorList = new ArrayList<>();

    private ArrayList<Mechanic<?>> allMechanicList = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.engineVolume = engineVolume > 0 ? engineVolume : 2;
        setBestLapTime(bestLapTime);
        setMaxSpeed(maxSpeed);
        allTransportList = new ArrayList<>();
        allDriverList = new LinkedList<>();
        allSponsorList = new ArrayList<>();
        allMechanicList = new ArrayList<>();
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

    public ArrayList<Transport> getAllTransportList() {
        return allTransportList;
    }

    public LinkedList<Driver<?>> getAllDriverList() {
        return allDriverList;
    }
    public ArrayList<Sponsor> getAllSponsorList() {
        return allSponsorList;
    }

    public ArrayList<Mechanic<?>> getAllMechanicList() {
        return allMechanicList;
    }
}
