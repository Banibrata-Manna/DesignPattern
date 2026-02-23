package factoryV2;

public class Bike<T extends Vehicle> {
    private boolean hasCarrier;
    private int gears;
    private boolean hasDiscBrakes;

    public Bike(boolean hasCarrier, int gears, boolean hasDiscBrakes) {
        this.hasCarrier = hasCarrier;
        this.gears = gears;
        this.hasDiscBrakes = hasDiscBrakes;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isHasDiscBrakes() {
        return hasDiscBrakes;
    }

    public void setHasDiscBrakes(boolean hasDiscBrakes) {
        this.hasDiscBrakes = hasDiscBrakes;
    }
}
