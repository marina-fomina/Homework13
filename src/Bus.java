public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
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
}
