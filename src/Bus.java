public class Bus extends Transport implements Competing {

    private final SeatingCapacity seatingCapacity;
    public Bus(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed, SeatingCapacity seatingCapacity) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
        this.seatingCapacity = seatingCapacity;
    }
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ". Объем двигателя - " + getEngineVolume() + " литра.";
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + "начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " заканчивает движение.");
    }

    @Override
    public void printType() {
        if (this.seatingCapacity != null) {
            System.out.println(this.seatingCapacity);
        } else {
            System.out.println("Данных по автобусу недостаточно.");
        }
    }

    @Override
    public void doDiagnistics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается.");
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " отремонтирован.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " заезжает на pit-stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автобуса " + getBrand() + " составило " + getBestLapTime() + ".");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " - " + getMaxSpeed() + " км/ч.");
    }

    public SeatingCapacity getSeatingCapacity() {
        return seatingCapacity;
    }
}
