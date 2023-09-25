// Define the package for the class
package com.codedifferentlty.labs.partB;

// Import necessary utilities: HashMap for storing the inventory and Map as its interface
import java.util.HashMap;
import java.util.Map;

// Define the class named InventoryCounter
public class InventoryCounter {

    // Declare a private instance variable 'inventory' of type Map
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryCounter(){
        // instantiate inventory with a new empty HashMap
        inventory = new HashMap<>();
    }

    // Public method to retrieve the current inventory
    public Map<String, Integer> getInventory() {
        // Return the current inventory map
        return inventory;
    }

    // Public method to add products to the inventory
    public void addToInventory(String product, int amount) {
        // Get the current quantity of the specified product, defaulting to 0 if it doesn't exist in the inventory
        int currentAmount = inventory.getOrDefault(product, 0);
        // Update the inventory by adding the specified amount to the product's current quantity
        inventory.put(product, currentAmount + amount);
    }

    // Public method to remove products from the inventory
    public void removeFromInventory(String product, int amount) {
        // Check if the inventory contains the specified product
        if (inventory.containsKey(product)) {
            // Get the current quantity of the specified product from the inventory
            int currentAmount = inventory.get(product);
            // Update the inventory by subtracting the specified amount from the product's current quantity
            // Use Math.max() to ensure the quantity doesn't drop below zero
            inventory.put(product, Math.max(0, currentAmount - amount)); // Ensure count doesn't go negative
        }
    }
}
