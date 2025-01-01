public class BaseRemoteControlCar implements RemoteControlCar {
    private final int units;
    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    protected BaseRemoteControlCar(int units) {
        this.units = units;
    }

    @Override
    public void drive() {
        distanceTravelled += units;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    @Override
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}
