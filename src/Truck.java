public class Truck extends Transport implements Competing {
private final CargoCapacity cargoCapacity;

private boolean diagnostics;

    public Truck (String brand, String model, double engineVolume, String bestLapTime, int maxSpeed, CargoCapacity cargoCapacity,
                  boolean diagnostics) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
        this.cargoCapacity = cargoCapacity;
        this.diagnostics = diagnostics;
    }
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + ". Объем двигателя - " + getEngineVolume() + " литра.";
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение.");
    }

    @Override
    public void printType() {
        if (this.cargoCapacity != null) {
            System.out.println(this.cargoCapacity);
        } else {
            System.out.println("Данных по грузовому автомобилю недостаточно.");
        }
    }

    @Override
    public void doDiagnistics() {
        if (this.diagnostics == true) {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
        } else {
            throw new DiagnosticsException("Автомобиль " + getBrand() + " " + getModel() + " не прошел диагностику!");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заезжает на pit-stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у грузового автомобиля " + getBrand() + " " + getModel() + " составило " + getBestLapTime() + ".");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " " + getModel() + " - " + getMaxSpeed() + " км/ч.");
    }

    public CargoCapacity getCargoCapacity() {
        return cargoCapacity;
    }

    public boolean isDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(boolean diagnostics) {
        this.diagnostics = diagnostics;
    }
}
