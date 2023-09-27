package com.codedifferentlty.labs.partD;

import java.util.Scanner;

public class BigMain {
    private POICounter poiCounter = new POICounter();

    // Method to handle adding a new POI
    private void option1() {
        System.out.println("Add a POI:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter POI Name: ");
        String name = sc.nextLine();
        poiCounter.addToPOI(name, 2.0);
        System.out.println("POI added successfully.");
    }
    // Method to handle searching for a POI by name
    private void option2() {
        System.out.println("Search POI by Name:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter POI Name: ");
        String name = sc.nextLine();
        POI poi = poiCounter.getPOI(name);
        if (poi != null) {
            System.out.println("POI Name: " + poi.getName());
            System.out.println("POI Average Rating: " + poi.getRating());
        } else {
            System.out.println("POI not found.");
        }
    }

    // Method to handle rating a POI
    private void option3() {
        System.out.println("Rate a POI:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter POI Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();
        poiCounter.rateToPOI(name, rating);
        System.out.println("Thanks Pookie! You rated '" + name + "' with " + rating + "/5.");
    }
    // Method to handle displaying all the POI's you've added
    private void option4() {
        poiCounter.displayAllPOIs();
    }
    // Method to handle deleting a POI
    private void option5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the POI to delete: ");
        String name = sc.nextLine();
        poiCounter.deletePOI(name);
    }

    // Main method to start the program
    public static void main(String[] args) {
        BigMain bigMain = new BigMain();
        bigMain.start();
    }
    // Method to display the main menu and handle user input
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n💅🏾 We Live in the 3️⃣0️⃣5️⃣ let the City Girls be yo guide👁️👅👁️----");
            System.out.println("\n🛍️1. Add a Point of Interest");
            System.out.println("🛍️2. Search Point of Interest by Name");
            System.out.println("🛍️3. Rate a Point of Interest");
            System.out.println("🛍️4. Display List");
            System.out.println("🛍️5. Delete a Point of Interest");
            System.out.println("🛍️6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                    option5();
                    break;
                case 6:
                    System.out.println("Exiting program...PERIOD💅🏾");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

}
