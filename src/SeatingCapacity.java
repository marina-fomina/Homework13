public enum SeatingCapacity {
    VERY_LITTLE(1, 10),
    LITTLE(10, 25),
    MIDDLE(40, 50),
    LARGE(60, 80),
    VERY_LARGE(100, 120);

    private final int minSeatsNumber;
    private final int maxSeatsNumber;

    SeatingCapacity(int minSeatsNumber, int maxSeatsNumber) {
        this.minSeatsNumber = minSeatsNumber;
        this.maxSeatsNumber = maxSeatsNumber;
    }

    @Override
    public String toString() {
        String seatsNumber = minSeatsNumber > 0 ? minSeatsNumber + " - " + maxSeatsNumber : String.valueOf(maxSeatsNumber);
        return "Вместимость автобуса " + name() + " " + seatsNumber + " мест.";
    }

    public int getMinSeatsNumber() {
        return minSeatsNumber;
    }

    public int getMaxSeatsNumber() {
        return maxSeatsNumber;
    }
}
