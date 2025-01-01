import java.util.Collections;
import java.util.List;

public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static <T extends RemoteControlCar & Comparable<T>> List<T> getRankedCars(List<T> cars) {
        Collections.sort(cars);
        return cars;
    }
}
