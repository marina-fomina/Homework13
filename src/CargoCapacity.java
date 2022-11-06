public enum CargoCapacity {
    N1 (null, 3.5),
    N2 (3.5, 12.0),
    N3 (12.0, null);
    private final Double minWeight;
    private final Double maxWeight;

    CargoCapacity(Double minWeight, Double maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public String toString() {
        String minWeightString = minWeight != null ? " от " + minWeight + " тонн" : "";
        String maxWeightString = maxWeight != null ? " до " + maxWeight + " тонн." : "";
        return "Грузоподъемность автомобиля" + minWeightString + maxWeightString;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
