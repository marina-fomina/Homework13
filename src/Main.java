import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Проверка логина и пароля
        System.out.println("Проверка логина и пароля");

        System.out.println(checkLoginAndPassword("LOGIN", "12345", "12345"));
        System.out.println(checkLoginAndPassword("_Fly_", "abc!", "abc!"));
        System.out.println(checkLoginAndPassword(" ", "power", "power"));
        System.out.println(checkLoginAndPassword("AbCd", "", ""));
        System.out.println(checkLoginAndPassword("Space", "111333", "111334"));

        // Класс Спонсоры
        System.out.println(" ");
        System.out.println("Класс Спонсоры");

        Sponsor sponsor1 = new Sponsor("Смирнов Андрей", 100_000);
        Sponsor sponsor2 = new Sponsor("Ёлкин Михаил", 90_000);
        Sponsor sponsor3 = new Sponsor("High Class Racing", 110_000);
        Sponsor sponsor4 = new Sponsor("FastProfi", 95_000);


        // Класс Механики
        System.out.println(" ");
        System.out.println("Класс Механики");

        Mechanic<Car> carMechanic = new Mechanic<Car> ("Друговской Максим", "Золотые руки");
        Mechanic<Truck> truckMechanic = new Mechanic<Truck> ("Макаров Олег", "ГрузРемТех");
        Mechanic<Bus> busMechanic = new Mechanic<Bus> ("Алиев Марат", "ТехСервис");
        Mechanic<Transport> allTransportMechanic = new Mechanic<Transport> ("Свободин Алексей", "Городские ремонтные мастерские");


        // Класс Легковые автомобили
        System.out.println(" ");
        System.out.println("Класс Легковые автомобили");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "5 минут и 32 секунды",
                240, BodyType.SEDAN, true);
        audi.addDriver(new DriverB ("Голубев Александр Юрьевич", "B", 7));
        audi.addSponsor(sponsor1, sponsor3);
        audi.addMechanic(carMechanic);

        Car bmw = new Car("BMW", "Z8", 3.0, "5 минут и 52 секунды",
                260, BodyType.COUPE, true);
        bmw.addDriver(new DriverB ("Петров Виталий Александрович", "B", 5));
        bmw.addSponsor(sponsor1, sponsor2);
        bmw.addMechanic(carMechanic);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "7 минут и 23 секунды",
                180, BodyType.OFF_ROADER, true);
        kia.addDriver(new DriverB("Фомин Семён Сергеевич", "B", 10));
        kia.addSponsor(sponsor4);
        kia.addMechanic(carMechanic);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "6 минут и 50 секунд",
                200, BodyType.SEDAN, false);
        hyundai.addDriver(new DriverB("Антонов Николай Петрович", "B", 9));
        hyundai.addSponsor(sponsor3);
        hyundai.addMechanic(carMechanic);

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

        System.out.println(" ");
        audi.doDiagnistics();
        kia.doDiagnistics();

        // Класс Грузовые автомобили
        System.out.println(" ");
        System.out.println("Класс Грузовые автомобили");

        Truck volvo = new Truck("Volvo", "FMX", 12.5, "9 минут и 15 секунд", 132,
                CargoCapacity.N3, true);
        volvo.addDriver(new DriverC("Маленков Евгений Игоревич", "C", 5));
        volvo.addSponsor(sponsor2, sponsor4);
        volvo.addMechanic(truckMechanic);

        Truck nissan = new Truck("Nissan", "Diesel", 19, "9 минут и 27 секунд", 120,
                CargoCapacity.N2, false);
        nissan.addDriver(new DriverC ("Николаев Эдуард Валентинович", "С", 8));
        nissan.addSponsor(sponsor1);
        nissan.addMechanic(truckMechanic);

        Truck man = new Truck("MAN", "TGA", 10.5, "8 минут и 56 секунд", 140,
                CargoCapacity.N3, false);
        man.addDriver(new DriverC ("Бондарь Юрий Данилович", "C", 8));
        man.addSponsor(sponsor2, sponsor3);
        man.addMechanic(allTransportMechanic);

        Truck renault = new Truck("Renault", "Magnum", 12.8, "8 минут и 50 секунд", 145,
                CargoCapacity.N2, true);
        renault.addDriver(new DriverC ("Каргинов Андрей Олегович", "С", 12));
        renault.addSponsor(sponsor1, sponsor4);
        renault.addMechanic(truckMechanic);

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

        Bus scania = new Bus("Scania", "Higer A80", 11.7, "11 минут и 22 секунды",
                100, SeatingCapacity.LARGE);
        scania.addDriver(new DriverD ("Прудников Семён Николаевич", "D", 6));
        scania.addSponsor(sponsor2);
        scania.addMechanic(busMechanic);

        Bus maz = new Bus("МАЗ", "251", 11.2, "11 минут и 43 секунды",
                95, SeatingCapacity.MIDDLE);
        maz.addDriver(new DriverD("Игнатов Матвей Анатольевич", "D", 7));
        maz.addSponsor(sponsor3, sponsor4);
        maz.addMechanic(allTransportMechanic);

        Bus olimp = new Bus("Олимп", "ВМЗ-4252", 10, "12 минут и 33 секунды",
                80, SeatingCapacity.LITTLE);
        olimp.addDriver(new DriverD ("Смирнов Иван Дмитриевич", "D", 11));
        olimp.addSponsor(sponsor1);
        olimp.addMechanic(busMechanic);

        Bus liaz = new Bus("ЛиАЗ", "5292", 6.9, "11 минут и 50 секунд",
                90, SeatingCapacity.VERY_LARGE);
        liaz.addDriver(new DriverD("Лукьянов Леонид Витальевич", "D", 9));
        liaz.addSponsor(sponsor3);
        liaz.addMechanic(allTransportMechanic);

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

        // Список всех автомобилей
        System.out.println(" ");
        System.out.println("Список всех автомобилей");

        List<Transport> allTransportList = List.of (audi, bmw, kia, hyundai,
                volvo, nissan, man, renault,
                scania, maz, olimp, liaz);

        // Класс Водители
        System.out.println(" ");
        System.out.println("Класс Водители");

        DriverB carDriver1 = new DriverB ("Петров Виталий Александрович", "B", 5);
        DriverB carDriver2 = new DriverB ("Голубев Александр Юрьевич", "B", 7);
        DriverB carDriver3 = new DriverB("Фомин Семён Сергеевич", "B", 10);
        DriverB carDriver4 = new DriverB("Антонов Николай Петрович", "B", 9);
        DriverC truckDriver1 = new DriverC ("Николаев Эдуард Валентинович", "С", 8);
        DriverC truckDriver2 = new DriverC ("Каргинов Андрей Олегович", "С", 12);
        DriverC truckDriver3 = new DriverC("Маленков Евгений Игоревич", "C", 5);
        DriverC truckDriver4 = new DriverC("Бондарь Юрий Данилович", "C", 8);
        DriverD busDriver1 = new DriverD ("Смирнов Иван Дмитриевич", "D", 11);
        DriverD busDriver2 = new DriverD ("Прудников Семён Николаевич", "D", 6);
        DriverD busDriver3 = new DriverD("Игнатов Матвей Анатольевич", "D", 7);
        DriverD busDriver4 = new DriverD("Лукьянов Леонид Витальевич", "D", 9);
        carDriver1.takePartInCompetition(bmw);
        carDriver2.takePartInCompetition(audi);
        truckDriver1.takePartInCompetition(nissan);
        truckDriver2.takePartInCompetition(renault);
        busDriver1.takePartInCompetition(olimp);
        busDriver2.takePartInCompetition(scania);
        carDriver1.checkDrivingLicense();



        for (Transport transport : allTransportList) {
            printInformation(transport);
        }

        ServiceStation station1 = new ServiceStation("Станция тех. обслуживания 1");
        station1.addToTransportQueue(audi);
        station1.addToTransportQueue(man);
        station1.service();
        station1.service();

        // Задания с очередями
        System.out.println(" ");
        System.out.println("Задания с очередями");

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);
        fillQueue(queue1);
        fillQueue(queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);

        System.out.println(" ");
        addToQueue("Ксения Пирогова", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);

        System.out.println(" ");
        remove(queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);

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

    private static void printInformation(Transport transport) {
        System.out.println("Данные по автомобилю: " + transport.getBrand() + " " + transport.getModel() + ".");
        System.out.println("Водитель: " + transport.getAllDriverList());
        System.out.println("Спонсоры: " + transport.getAllSponsorList());
        System.out.println("Механики: " + transport.getAllMechanicList());
    }

    private static final List<String> PEOPLE = List.of("Сергей Голубев", "Анна Павлова", "Наталья Пуговкина", "Светлана Травкина",
            "Андрей Бочкин", "Евгений Смирнов", "Елена Дубова", "Дмитрий Синицын", "Анатолий Грушин", "Николай Ветров");

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    private static void fillQueue(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(PEOPLE.get(RANDOM.nextInt(PEOPLE.size())));
        }
    }

    private static void addToQueue(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
}