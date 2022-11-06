public enum BodyType {
    SEDAN ("Седан"),
    HATCHBACK ("Хетчбек"),
    COUPE ("Купе"),
    WAGON ("Универсал"),
    OFF_ROADER ("Внедорожник"),
    CROSSOVER ("Кроссовер"),
    PICKUP ("Пикап"),
    CAMPER ("Фургон"),
    MINIVAN ("Минивэн");

    private final String bodyTypeName;

    BodyType(String bodyTypeName) {
        this.bodyTypeName = bodyTypeName;
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }

    public String toString() {
        return "Тип кузова автомобиля - " + getBodyTypeName();
    }
}
