// Define the package for the class
package com.codedifferentlty.labs.partB;

// Import necessary utilities: Java's Map interface
import java.util.Map;

// Define the class named MainInventoryApp
public class MainInventoryApp {

    // Method to display the current inventory contents
    public static void displayInventory(Map<String, Integer> inventory) {
        // Print out a header message for clarity
        System.out.println("Current Inventory:");

        // Iterate through each item in the inventory map
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            // Print the product name (key) and its quantity (value)
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Main method where the program execution begins
    public static void main(String[] args) {
        // Create an instance of the InventoryCounter class
        InventoryCounter inventoryCounter = new InventoryCounter();

        // Add items to the inventory: Apples with a quantity of 10
        inventoryCounter.addToInventory("Apples", 10);
        // Add items to the inventory: Oranges with a quantity of 7
        inventoryCounter.addToInventory("Oranges", 7);
        // Add items to the inventory: Milk cartons with a quantity of 20
        inventoryCounter.addToInventory("Milk cartons", 20);

        // Display the current status of the inventory using the displayInventory method
        displayInventory(inventoryCounter.getInventory());

        // Add more Apples to the inventory, increasing its quantity by 5
        inventoryCounter.addToInventory("Apples", 5);
        // Remove some Oranges from the inventory, reducing its quantity by 2
        inventoryCounter.removeFromInventory("Oranges", 2);

        // Display the updated status of the inventory after modifications
        displayInventory(inventoryCounter.getInventory());
    }
}
