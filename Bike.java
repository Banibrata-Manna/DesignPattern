package DesignPatterns.factorypatterns;

import java.util.Map;

public class Bike implements Vehicle{
  private final Map<String, String> properties;

  public Bike(Map<String, String> properties){
    this.properties = properties;
  }

  @Override
  public void build() {
    System.out.println("Built Bike");

  }

  @Override
  public String toString() {
    return "Bike{" +
        "properties=" + properties +
        '}';
  }
}
