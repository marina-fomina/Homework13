public class Driver <B extends Transport & Competing> {

    private final String name;
    private final String drivingLicenseType;
    private int drivingExperience;

    private static final String DEFAULT_VALUE = "default";

    public Driver(String name, String drivingLicenseType, int drivingExperience) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_VALUE);
        this.drivingLicenseType = ValidationUtils.validOrDefault(drivingLicenseType, DEFAULT_VALUE);
        setDrivingExperience(drivingExperience);
    }

    public String toString() {
        return "Водитель " + name + " имеет водительское удостоверение категории " + drivingLicenseType +
                ". Водительский стаж - " + drivingExperience + " лет.";
    }

    public void takePartInCompetition(B transport) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде.");
    }

    public void startDriving() {
        System.out.println("Водитель " + name + " начинает движение.");
    }

    public void stopDriving() {
        System.out.println("Водитель " + name + " останавливается.");
    }

    public void refill() {
        System.out.println("Водитель " + name + " заправляет автомобиль.");
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicenseType() {
        return drivingLicenseType;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience > 0 ? drivingExperience : 1;
    }
}
