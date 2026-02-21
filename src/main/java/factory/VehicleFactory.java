package factory;

import java.util.Map;

public abstract class VehicleFactory {
  public Vehicle create(Map<String, String> propertyMap) throws NullPointerException{
    return createVehicle(propertyMap);
  }
  protected abstract Vehicle createVehicle(Map<String, String> propertyMap);
}
