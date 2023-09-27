package com.codedifferentlty.labs.partD;

import java.util.HashMap;
import java.util.Map;

public class POICounter {

    private Map<POI, Double> locations = new HashMap<>();

    public POICounter() {
        locations = new HashMap<>();
    }

    public Map<POI, Double> getPOI() {
        return locations;
    }

    public void addPOI(POI poi, Double rating){
        locations.put(poi, rating);
    }

    public void addRating(String name, double rating) {

//        double currentRating = locations.getOrDefault(name, 0.0);
//        locations.put(poi, currentRating + rating);
    }

    public void removePOI(String name){

    }




    public void removeRating(String name, double rating) {
//        if (locations.containsKey(name)) {
//            double currentRating = locations.get(name);
//
//            locations.put(name, Math.max(0, currentRating - rating));
//        }
    }

    public void displayPOI(Map<POI, Double>POIList) {
   for (Map.Entry<POI, Double> entry : POIList.entrySet()) {
            System.out.println(entry.getKey().toString() + "  (Rating " + entry.getValue() + "/5)");
        }
        }


    }

