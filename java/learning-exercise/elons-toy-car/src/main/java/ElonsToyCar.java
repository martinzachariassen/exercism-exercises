public class ElonsToyCar {
    private static final String DISTANCE_DISPLAY_FORMAT = "Driven %d meters";
    private static final String BATTERY_DISPLAY_FORMAT = "Battery at %d%%";
    private static final String BATTERY_EMPTY_MESSAGE = "Battery empty";

    private int distanceDriven;
    private int batteryPercentage;

    ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format(DISTANCE_DISPLAY_FORMAT, distanceDriven);
    }

    public String batteryDisplay() {
        return batteryPercentage == 0
                ? BATTERY_EMPTY_MESSAGE
                : String.format(BATTERY_DISPLAY_FORMAT, batteryPercentage);
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}
