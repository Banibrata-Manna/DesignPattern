package factoryV2;

import factoryV2.utils.VehicleUtils;

public class ElectricVehicle extends Vehicle{
    double batteryCapacity;
    double rangePerCharge;
    double chargingTime;
    double chargingPortType;
    double motorPower;
    double regenerativeBrakingEnabled;

    public ElectricVehicle(String id, String modelName, String color, String manufacturer, VehicleUtils.EngineType engineType, int numberOfWheels, double batteryCapacity, double rangePerCharge, double chargingTime, double chargingPortType, double motorPower, double regenerativeBrakingEnabled) {
        super(id, modelName, color, manufacturer, engineType, numberOfWheels);
        this.batteryCapacity = batteryCapacity;
        this.rangePerCharge = rangePerCharge;
        this.chargingTime = chargingTime;
        this.chargingPortType = chargingPortType;
        this.motorPower = motorPower;
        this.regenerativeBrakingEnabled = regenerativeBrakingEnabled;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "batteryCapacity=" + batteryCapacity +
                ", rangePerCharge=" + rangePerCharge +
                ", chargingTime=" + chargingTime +
                ", chargingPortType=" + chargingPortType +
                ", motorPower=" + motorPower +
                ", regenerativeBrakingEnabled=" + regenerativeBrakingEnabled +
                ", id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", engineType=" + engineType +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
