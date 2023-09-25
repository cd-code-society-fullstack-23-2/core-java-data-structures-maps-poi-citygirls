package com.codedifferentlty.labs.partC;

import java.util.Scanner;

public class TerminalApp {

    private void printMenu() {
        System.out.println("\n---- Terminal App Menu ----");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
    }

    private void option1() {
        System.out.println("You selected Option 1.");
        // Add relevant code for Option 1 functionality
    }

    private void option2() {
        System.out.println("You selected Option 2.");
        // Add relevant code for Option 2 functionality
    }

    private void option3() {
        System.out.println("You selected Option 3.");
        // Add relevant code for Option 3 functionality
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

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
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        TerminalApp app = new TerminalApp();
        app.start();
    }
}
