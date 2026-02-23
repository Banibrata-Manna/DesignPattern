package factory;

import java.util.Map;

public class CarFactory extends VehicleFactory{
  @Override
  protected Vehicle createVehicle(Map<String, String> propertyMap) {
    return new Car(propertyMap);
  }
}
