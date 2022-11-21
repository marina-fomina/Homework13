import java.util.Objects;

public abstract class Driver <B extends Transport & Competing> {

    private final String name;
    private final String drivingLicenseType;
    private int drivingExperience;

    private static final String DEFAULT_VALUE = "default";

    public Driver(String name, String drivingLicenseType, int drivingExperience) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_VALUE);
        this.drivingLicenseType = ValidationUtils.validOrDefault(drivingLicenseType, DEFAULT_VALUE);
        setDrivingExperience(drivingExperience);
    }

    public void checkDrivingLicense() {
        if (drivingLicenseType.equals("B") || drivingLicenseType.equals("C") || drivingLicenseType.equals("D")) {
        } else {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
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
        System.out.printf("Водитель %s начинает движение.", this.name);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
