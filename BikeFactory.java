package DesignPatterns.factorypatterns;

import java.util.Map;

public class BikeFactory extends VehicleFactory{
  @Override
  protected Vehicle createVehicle(Map<String, String> propertyMap) {
    return new Bike(propertyMap);
  }
}
