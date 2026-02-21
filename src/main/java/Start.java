import factory.BikeFactory;

import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {
        System.out.println("-=-=-=-=- Starting Application -=-=-=-=-");

        BikeFactory bikeFactory = new BikeFactory();

        Map<String, String> bikeMap = new HashMap<>();
        bikeMap.put("VehicleType", "Bike");
        bikeMap.put("Color", "Red");
        bikeMap.put("Size", "Small");
        bikeMap.put("Name", "HF-Deluxe");
        System.out.println("-=-=-=-=- New Bike Manufactured: " + bikeFactory.create(bikeMap));
    }
}
