public class ProductionRemoteControlCar extends BaseRemoteControlCar implements Comparable<ProductionRemoteControlCar> {
    public ProductionRemoteControlCar() {
        super(10);
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
