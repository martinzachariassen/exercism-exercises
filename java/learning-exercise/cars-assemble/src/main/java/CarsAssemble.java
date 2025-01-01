public class CarsAssemble {
    private static final int PRODUCTION_RATE_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        validateSpeed(speed);
        double successRate = getSuccessRate(speed);
        return PRODUCTION_RATE_PER_HOUR * speed * (successRate / 100);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    private void validateSpeed(int speed) {
        if (speed < 0 || speed > 10) {
            throw new IllegalArgumentException("Speed must be in the range 0 to 10 inclusive");
        }
    }

    private double getSuccessRate(int speed) {
        if (speed == 0) {
            return 0;
        } else if (speed <= 4) {
            return 100;
        } else if (speed <= 8) {
            return 90;
        } else if (speed == 9) {
            return 80;
        } else { // speed == 10
            return 77;
        }
    }
}
