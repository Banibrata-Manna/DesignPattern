```mermaid
classDiagram

class Vehicle {
    -String id;
    -String modelName;
    -String color;
    -String manufacturer;
    -EngineType engineType;
}

class FuelVehicle {
    -fuel
    -fuelTankCapacity
    -engineCapacity
    -mileage
    -emissionStandard
}

class ElectricVehicle {
    -batteryCapacity
    -rangePerCharge
    -chargingTime
    -chargingPortType
    -motorPower
    -regenerativeBrakingEnabled
}

Vehicle <|-- ElectricVehicle
Vehicle <|-- FuelVehicle

class Car~T~ {
    -int numberOfDoors
    -int seatingCapacity
    -boolean hasSunroof
    -double trunkCapacity
}

class Bike~T~ {
    -boolean hasCarrier
    -int gears
    -boolean hasDiscBrakes
}