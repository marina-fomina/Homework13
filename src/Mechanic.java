import java.util.Objects;

public class Mechanic <A extends Transport> {
    private final String mechanicName;
    private String mechanicCompany;

    private A transportType;

    private static final String DEFAULT_VALUE = "default";

    public Mechanic(String mechanicName, String mechanicCompany) {
        this.mechanicName = ValidationUtils.validOrDefault(mechanicName, DEFAULT_VALUE);
        setMechanicCompany(mechanicCompany);
    }

    public String toString() {
        return "Механик " + getMechanicName() + " из компании " + getMechanicCompany() + ".";
    }

    public void serviceTransport() {
        System.out.println("Механик " + getMechanicName() + " проводит техобслуживание.");
    }

    public void repairTransport(A transport) {
        System.out.println("Механик " + getMechanicName() + " ремонтирует автомобиль.");
        transport.repair();
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String getMechanicCompany() {
        return mechanicCompany;
    }

    public void setMechanicCompany(String mechanicCompany) {
        this.mechanicCompany = ValidationUtils.validOrDefault(mechanicCompany, DEFAULT_VALUE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(mechanicName, mechanic.mechanicName) && Objects.equals(mechanicCompany, mechanic.mechanicCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicName, mechanicCompany);
    }
}
