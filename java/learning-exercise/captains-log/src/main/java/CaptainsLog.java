import java.util.Objects;
import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = {'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final int SHIP_REGISTRY_MIN = 1000;
    private static final int SHIP_REGISTRY_MAX = 9999;
    private static final double STAR_DATE_MIN = 41000.0;
    private static final double STAR_DATE_MAX = 42000.0;

    private Random random;

    CaptainsLog(Random random) {
        this.random = Objects.requireNonNull(random, "Random generator must not be null");
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[this.random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        int registryNumber = SHIP_REGISTRY_MIN + random.nextInt(SHIP_REGISTRY_MAX - SHIP_REGISTRY_MIN + 1);
        return "NCC-" + registryNumber;
    }

    double randomStardate() {
        return STAR_DATE_MIN + random.nextDouble() * (STAR_DATE_MAX - STAR_DATE_MIN);
    }
}
