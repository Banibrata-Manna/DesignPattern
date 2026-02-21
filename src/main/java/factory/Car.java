package factory;

import java.util.Map;

public class Car implements Vehicle{
  private final Map<String, String> properties;

  public Car(Map<String, String> properties) {
    this.properties = properties;
  }

  @Override
  public void build() {
    System.out.println("Car Built");
  }

  @Override
  public String toString() {
    return "Car{" +
        "properties=" + properties +
        '}';
  }
}
