public abstract class Transport {
    private String brand;
    private String model;

    private final double engineVolume;

    private String bestLapTime;

    private int maxSpeed;

    private static final String DEFAULT_VALUE = "default";

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
}
