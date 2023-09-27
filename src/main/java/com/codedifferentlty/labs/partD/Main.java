package com.codedifferentlty.labs.partD;
import java.util.Scanner;


public class Main {
    POICounter poiCounter = new POICounter();
    private void printMenu() {
        System.out.println("\n ---- We Live in the (305) Let the City Girls be Yo Guide ----");
        System.out.println("1. Add a Point of Interest");
        System.out.println("2. Search Point of Interest by name");
        System.out.println("3. Rate Point of Interest");
        System.out.println("4. Display list");
        System.out.println("5. Delete Point of Interest");
        System.out.println("0. Exit");
    }

    private void option1() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("You selected to add a Point of Interest");
        System.out.println("Please enter name");

        String name = scanner.nextLine();
        POI poi = new POI(name);

        poiCounter.addPOI(poi, null);


    }

    private void option2() {
        System.out.println("Search Point of Interest by name");
    }

    private void option3() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Rate Point of Interest");
        String name = scanner.nextLine();

        System.out.println("Please rate POI");
        Double rating = scanner.nextDouble();
        poiCounter.addRating(name, rating);
    }

    private void option4() {
        System.out.println("You selected to display a Point of Interest");
        poiCounter.displayPOI(poiCounter.getPOI());


    }
    private void option5() {
        System.out.println("Select a Point of Interest to delete.");
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            System.out.println("Enter you choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

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
                case 0:
                    System.out.println("Exiting the city guide. Period!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void main(String[] args) {
Main main = new Main();
main.start();
    }
}
