public class Main {
    public static void main(String[] args) {
        // Класс "Легковые автомобили"
        System.out.println("Класс Легковые автомобили");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "5 минут и 32 секунды", 240);
        Car bmw = new Car("BMW", "Z8", 3.0, "5 минут и 52 секунды", 260);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "7 минут и 23 секунды", 180);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "6 минут и 50 секунд", 200);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        audi.pitStop();
        audi.bestLapTime();
        audi.maxSpeed();
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        kia.pitStop();
        kia.bestLapTime();
        kia.maxSpeed();
        hyundai.pitStop();
        hyundai.bestLapTime();
        hyundai.maxSpeed();

        // Класс "Грузовые автомобили"
        System.out.println(" ");
        System.out.println("Класс Грузовые автомобили");

        Truck volvo = new Truck("Volvo", "FMX", 12.5, "9 минут и 15 секунд", 132);
        Truck nissan = new Truck("Nissan", "Diesel", 19, "9 минут и 27 секунд", 120);
        Truck man = new Truck("MAN", "TGA", 10.5, "8 минут и 56 секунд", 140);
        Truck renault = new Truck("Renault", "Magnum", 12.8, "8 минут и 50 секунд", 145);
        System.out.println(volvo);
        System.out.println(nissan);
        System.out.println(man);
        System.out.println(renault);

        volvo.pitStop();
        volvo.bestLapTime();
        volvo.maxSpeed();
        nissan.pitStop();
        nissan.bestLapTime();
        nissan.maxSpeed();
        man.pitStop();
        man.bestLapTime();
        man.maxSpeed();
        renault.pitStop();
        renault.bestLapTime();
        renault.maxSpeed();


        // Класс "Автобусы"
        System.out.println(" ");
        System.out.println("Класс Автобусы");

        Bus scania = new Bus("Scania", "Higer A80", 11.7, "11 минут и 22 секунды", 100);
        Bus maz = new Bus("МАЗ", "251", 11.2, "11 минут и 43 секунды", 95);
        Bus olimp = new Bus("Олимп", "ВМЗ-4252", 10, "12 минут и 33 секунды", 80);
        Bus liaz = new Bus("ЛиАЗ", "5292", 6.9, "11 минут и 50 секунд", 90);
        System.out.println(scania);
        System.out.println(maz);
        System.out.println(olimp);
        System.out.println(liaz);

        scania.pitStop();
        scania.bestLapTime();
        scania.maxSpeed();
        maz.pitStop();
        maz.bestLapTime();
        maz.maxSpeed();
        olimp.pitStop();
        olimp.bestLapTime();
        olimp.maxSpeed();
        liaz.pitStop();
        liaz.bestLapTime();
        liaz.maxSpeed();

        // Класс "Водители"
        System.out.println(" ");
        System.out.println("Класс Водители");

        Driver<Car> carDriver1 = new Driver<> ("Петров Виталий Александрович", "В", 5);
        Driver<Car> carDriver2 = new Driver<>("Голубев Александр Юрьевич", "В", 7);
        Driver<Truck> truckDriver1 = new Driver<>("Николаев Эдуард Валентинович", "С", 8);
        Driver<Truck> truckDriver2 = new Driver<>("Каргинов Андрей Олегович", "С", 12);
        Driver<Bus> busDriver1 = new Driver<>("Смирнов Иван Дмитриевич", "D", 11);
        Driver<Bus> busDriver2 = new Driver<>("Прудников Семён Николаевич", "D", 6);
        carDriver1.takePartInCompetition(bmw);
        carDriver2.takePartInCompetition(audi);
        truckDriver1.takePartInCompetition(nissan);
        truckDriver2.takePartInCompetition(renault);
        busDriver1.takePartInCompetition(olimp);
        busDriver2.takePartInCompetition(scania);
    }
}