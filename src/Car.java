public class Car extends Transport implements Competing {
private final BodyType bodyType;

    public Car(String brand, String model, double engineVolume, String bestLapTime, int maxSpeed, BodyType bodyType) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
        this.bodyType = bodyType;
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
    public void printType() {
        if (this.bodyType != null) {
            System.out.println("Тип кузова автомобиля " + getBrand() + " " + getModel() + " - " + bodyType.getBodyTypeName() + ".");
        } else {
            System.out.println("Данных по автомобилю недостаточно.");
        }
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

    public BodyType getBodyType() {
        return bodyType;
    }
}
