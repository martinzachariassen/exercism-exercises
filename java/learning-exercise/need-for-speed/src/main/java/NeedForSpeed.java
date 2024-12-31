class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int batteryPercentage = 100;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        if (speed <= 0 || batteryDrain <= 0) {
            throw new IllegalArgumentException("Speed and battery drain must be positive");
        }
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getMaximumDistance() {
        return (batteryPercentage / batteryDrain) * speed;
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       return car.getMaximumDistance() >= distance;
    }
}
