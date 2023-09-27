package com.codedifferentlty.labs.partD;

import java.util.HashMap;
import java.util.Map;

public class POICounter {

    // A map to store POI objects by their names
    private Map<String, POI> poiMap = new HashMap<>();

    // Add a new POI with a given name and an initial rating of 0.0
    public void addToPOI(String name, double v) {
        poiMap.putIfAbsent(name, new POI(name, 0.0));
    }

    // Rate an existing POI by its name
    public void rateToPOI(String name, double rating) {
        if (poiMap.containsKey(name)) {
            POI poi = poiMap.get(name);
            poi.setRating(poi.getRating() + rating);
        }
    }

    // Retrieve a POI by its name
    public POI getPOI(String name) {
        return poiMap.get(name);
    }

    //display the POIs
    public void displayAllPOIs() {
        System.out.println("Displaying all Points of Interest:");
        for (POI poi : poiMap.values()) {
            System.out.println("POI Name: " + poi.getName() + ", Rating: " + poi.getRating());
        }
    }

    // Remove a POI by its name
    public void deletePOI(String name) {
        if (poiMap.containsKey(name)) {
            poiMap.remove(name);
            System.out.println(name + " has been deleted.");
        } else {
            System.out.println(name + " does not exist.");
        }
    }
}
