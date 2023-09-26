package com.codedifferentlty.labs.partD;



public class MainPoiApp {

    // The main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create a new POI object with rating 0
        POI southBeach = new POI("South Beach", 0);

        POI versaceMansion = new POI("Versace Mansion", 0);

        POI wynWood = new POI("Wynwood", 0);

        POI designDistrict = new POI("Design District", 0);

        POI clubLiv = new POI("Club Liv", 0);

        POI clubEleven = new POI("Club Eleven", 0);

        // Check if one POI is greater than the other in ratings
        if (southBeach.compareTo(versaceMansion) >= 0) { // greater than or equal to 0
            System.out.println(southBeach.getRating() + " is higher than " + versaceMansion.getRating());
        }
        if (wynWood.compareTo(designDistrict) >= 0) { // greater than or equal to 0
            System.out.println(wynWood.getRating() + " is higher than " + designDistrict.getRating());
        }
        if (clubLiv.compareTo(clubEleven) >= 0) { // greater than or equal to 0
            System.out.println(clubLiv.getRating() + " is higher than " + clubEleven.getRating());
        }
        //
        else if (southBeach.compareTo(versaceMansion) <= 0) {
            System.out.println(southBeach.getRating() + " is less than " + versaceMansion.getRating());
        } else if (wynWood.compareTo(designDistrict) <= 0) {
            System.out.println(wynWood.getRating() + " is less than " + designDistrict.getRating());
        } else if (clubLiv.compareTo(clubEleven) <= 0) {
            System.out.println(clubLiv.getRating() + " is less than " + clubEleven.getRating());
        }
        // If neither of the above conditions is met, then the POIs have an equal rating
        else {
            System.out.println(southBeach.getRating() + " and " + versaceMansion.getRating() + " are equal rating.");
        }
        System.out.println(wynWood.getRating() + " and " + designDistrict.getRating() + " are equal rating.");
    }
}