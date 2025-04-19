package DesignPatterns.factorypatterns;

import java.util.Map;

public abstract class VehicleFactory {
  public Vehicle create(Map<String, String> propertyMap) throws NullPointerException{
    Vehicle vehicle = createVehicle(propertyMap);
    return createVehicle(propertyMap);
  }
  protected abstract Vehicle createVehicle(Map<String, String> propertyMap);
}
