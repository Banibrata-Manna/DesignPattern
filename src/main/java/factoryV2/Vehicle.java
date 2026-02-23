package factoryV2;

import factoryV2.utils.VehicleUtils.EngineType;

public abstract class Vehicle {
    String id;
    String modelName;
    String color;
    String manufacturer;
    EngineType engineType;
    int numberOfWheels;

    public Vehicle(String id, String modelName, String color, String manufacturer, EngineType engineType, int numberOfWheels) {
        this.id = id;
        this.modelName = modelName;
        this.color = color;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.numberOfWheels = numberOfWheels;
    }
}