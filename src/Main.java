public class Main {
    public static void main(String[] args) {
        // Класс Легковые автомобили
        System.out.println("Класс Легковые автомобили");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "5 минут и 32 секунды", 240, BodyType.SEDAN, true);
        Car bmw = new Car("BMW", "Z8", 3.0, "5 минут и 52 секунды", 260, BodyType.COUPE, true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "7 минут и 23 секунды", 180, BodyType.OFF_ROADER, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "6 минут и 50 секунд", 200, BodyType.SEDAN, false);
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

        audi.printType();
        bmw.printType();
        kia.printType();
        hyundai.printType();

        // Класс Грузовые автомобили
        System.out.println(" ");
        System.out.println("Класс Грузовые автомобили");

        Truck volvo = new Truck("Volvo", "FMX", 12.5, "9 минут и 15 секунд", 132, CargoCapacity.N3, true);
        Truck nissan = new Truck("Nissan", "Diesel", 19, "9 минут и 27 секунд", 120, CargoCapacity.N2, false);
        Truck man = new Truck("MAN", "TGA", 10.5, "8 минут и 56 секунд", 140, CargoCapacity.N3, false);
        Truck renault = new Truck("Renault", "Magnum", 12.8, "8 минут и 50 секунд", 145, CargoCapacity.N2, true);
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

        volvo.printType();
        nissan.printType();
        man.printType();
        renault.printType();


        // Класс Автобусы
        System.out.println(" ");
        System.out.println("Класс Автобусы");

        Bus scania = new Bus("Scania", "Higer A80", 11.7, "11 минут и 22 секунды", 100, SeatingCapacity.LARGE);
        Bus maz = new Bus("МАЗ", "251", 11.2, "11 минут и 43 секунды", 95, SeatingCapacity.MIDDLE);
        Bus olimp = new Bus("Олимп", "ВМЗ-4252", 10, "12 минут и 33 секунды", 80, SeatingCapacity.LITTLE);
        Bus liaz = new Bus("ЛиАЗ", "5292", 6.9, "11 минут и 50 секунд", 90, SeatingCapacity.VERY_LARGE);
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

        scania.printType();
        maz.printType();
        olimp.printType();
        liaz.printType();

        // Класс "Водители"
        System.out.println(" ");
        System.out.println("Класс Водители");

        DriverB carDriver1 = new DriverB ("Петров Виталий Александрович", "B", 5);
        DriverB carDriver2 = new DriverB ("Голубев Александр Юрьевич", "B", 7);
        DriverC truckDriver1 = new DriverC ("Николаев Эдуард Валентинович", "С", 8);
        DriverC truckDriver2 = new DriverC ("Каргинов Андрей Олегович", "С", 12);
        DriverD busDriver1 = new DriverD ("Смирнов Иван Дмитриевич", "D", 11);
        DriverD busDriver2 = new DriverD ("Прудников Семён Николаевич", "D", 6);
        carDriver1.takePartInCompetition(bmw);
        carDriver2.takePartInCompetition(audi);
        truckDriver1.takePartInCompetition(nissan);
        truckDriver2.takePartInCompetition(renault);
        busDriver1.takePartInCompetition(olimp);
        busDriver2.takePartInCompetition(scania);
        carDriver1.checkDrivingLicense();

        // Проверка логина и пароля
        System.out.println(" ");
        System.out.println("Проверка логина и пароля");
        System.out.println(checkLoginAndPassword("LOGIN", "12345", "12345"));
        System.out.println(checkLoginAndPassword("_Fly_", "abc!", "abc!"));
        System.out.println(checkLoginAndPassword(" ", "power", "power"));
        System.out.println(checkLoginAndPassword("AbCd", "", ""));
        System.out.println(checkLoginAndPassword("Space", "111333", "111334"));

        System.out.println(" ");
        audi.doDiagnistics();
        kia.doDiagnistics();
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            return LoginAndPasswordValidation.validateLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при проверке логина: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при проверке пароля: " + e.getMessage());
            return false;
        } finally {
            System.out.println("Логин и пароль проверены.");
        }
    }
}