package com.codedifferentlty.labs.partD;

public class MainPOIApp {
    public static void main(String[] args) {

        POI southBeach = new POI("South Beach");

        POI versaceMansion = new POI("Versace Mansion");

        POI wynwood = new POI("Wynwood");

        POI designDistrict = new POI("Design District");

        POI clubLIV = new POI("Club LIV");

        POI clubE11even = new POI("Club E11even");

        // Check if one POI is greater than the other in ratings
        if (southBeach.compareTo(versaceMansion) > 0) { // greater than or equal to 0
            System.out.println(southBeach.getRating() + " is higher than " + versaceMansion.getRating());
        }
        if (wynwood.compareTo(designDistrict) > 0) { // greater than or equal to 0
            System.out.println(wynwood.getRating() + " is higher than " + designDistrict.getRating());
        }
        if (clubLIV.compareTo(clubE11even) > 0) { // greater than or equal to 0
            System.out.println(clubLIV.getRating() + " is higher than " + clubE11even.getRating());
        }
        //
        else if (southBeach.compareTo(versaceMansion) <= 0) {
            System.out.println(southBeach.getRating() + " is less than " + versaceMansion.getRating());
        } else if (wynwood.compareTo(designDistrict) <= 0) {
            System.out.println(wynwood.getRating() + " is less than " + designDistrict.getRating());
        } else if (clubLIV.compareTo(clubE11even) <= 0) {
            System.out.println(clubLIV.getRating() + " is less than " + clubE11even.getRating());
        }
        // If neither of the above conditions is met, then the POIs have an equal rating
        else {
            System.out.println(southBeach.getRating() + " and " + versaceMansion.getRating() + " are equal rating.");
        }
        System.out.println(wynwood.getRating() + " and " + designDistrict.getRating() + " are equal rating.");
    }
}
