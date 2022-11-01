public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + getBrand() + " " + getModel() + ". Объем двигателя - " + getEngineVolume() + " литра.";
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заезжает на pit-stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у легкового автомобиля " + getBrand() + " " + getModel() + " составило " + getBestLapTime() + ".");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля " + getBrand() + " " + getModel() + " - " + getMaxSpeed() + " км/ч.");
    }
}
