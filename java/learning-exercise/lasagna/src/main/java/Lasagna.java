public class Lasagna {
    private static final int DEFAULT_EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_MINUTES_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return DEFAULT_EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        if (actualMinutes < 0 || actualMinutes > DEFAULT_EXPECTED_MINUTES_IN_OVEN) {
            throw new IllegalArgumentException("Minutes should be between 0 and " + DEFAULT_EXPECTED_MINUTES_IN_OVEN + ".");
        }
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        if (layers < 0) {
            throw new IllegalArgumentException("Layers should be a non-negative number.");
        }
        return PREPARATION_MINUTES_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int actualMinutes) {
        return preparationTimeInMinutes(layers) + actualMinutes;
    }
}
