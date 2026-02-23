package factoryV2;

public class Car<T extends Vehicle> {
    private int numberOfDoors;
    private int seatingCapacity;
    private boolean hasSunroof;
    private double trunkCapacity;
    private int gears;

    public Car(int numberOfDoors, int seatingCapacity, boolean hasSunroof, double trunkCapacity,  int gears) {
        this.numberOfDoors = numberOfDoors;
        this.seatingCapacity = seatingCapacity;
        this.hasSunroof = hasSunroof;
        this.trunkCapacity = trunkCapacity;
        this.gears = gears;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public int getGears() { return gears; }

    public void setGears(int gears) { this.gears = gears; }
}
