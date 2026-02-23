package factoryV2;

import factoryV2.utils.VehicleUtils;
import factoryV2.utils.VehicleUtils.EmissionStandard;
import factoryV2.utils.VehicleUtils.Fuel;

public class FuelVehicle extends  Vehicle {
    Fuel fuel;
    double fuelTankCapacity;
    double engineCapacity;
    double mileage;
    EmissionStandard emissionStandard;

    public FuelVehicle(String id, String modelName, String color, String manufacturer, VehicleUtils.EngineType engineType, int numberOfWheels, Fuel fuel, double fuelTankCapacity, double engineCapacity, double mileage, EmissionStandard emissionStandard) {
        super(id, modelName, color, manufacturer, engineType, numberOfWheels);
        this.fuel = fuel;
        this.fuelTankCapacity = fuelTankCapacity;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.emissionStandard = emissionStandard;
    }

    @Override
    public String toString() {
        return "FuelVehicle{" +
                "numberOfWheels=" + numberOfWheels +
                ", engineType=" + engineType +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", modelName='" + modelName + '\'' +
                ", id='" + id + '\'' +
                ", emissionStandard=" + emissionStandard +
                ", mileage=" + mileage +
                ", engineCapacity=" + engineCapacity +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", fuel=" + fuel +
                '}';
    }
}
