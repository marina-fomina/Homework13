public class Truck extends Transport implements Competing {
    public Truck (String brand, String model, double engineVolume, String bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
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
}
