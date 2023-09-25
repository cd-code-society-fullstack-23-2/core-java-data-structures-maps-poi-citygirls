// Define the package where the test class belongs
package com.codedifferentlty.labs.partB;

// Import necessary JUnit5 annotations and assertion methods
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Define the test class for InventoryCounter
class InventoryCounterTest {

    // Declare a private variable for the InventoryCounter instance
    private InventoryCounter inventoryCounter;

    // Set up the initial test conditions before each test method is executed
    @BeforeEach
    void setUp() {
        // Create a new instance of InventoryCounter before each test
        inventoryCounter = new InventoryCounter();
    }

    // Define a test case for the addToInventory method
    @Test
    void testAddToInventory() {
        // Add 10 "Apples" to the inventory
        inventoryCounter.addToInventory("Apples", 10);
        // Check if the count of "Apples" in the inventory is indeed 10
        assertEquals(10, inventoryCounter.getInventory().get("Apples"));

        // Add another 5 "Apples" to the inventory
        inventoryCounter.addToInventory("Apples", 5);
        // Check if the total count of "Apples" in the inventory is now 15
        assertEquals(15, inventoryCounter.getInventory().get("Apples"));
    }

    // Define a test case for the removeFromInventory method
    @Test
    void testRemoveFromInventory() {
        // Add 7 "Oranges" to the inventory
        inventoryCounter.addToInventory("Oranges", 7);
        // Check if the count of "Oranges" in the inventory is indeed 7
        assertEquals(7, inventoryCounter.getInventory().get("Oranges"));

        // Remove 2 "Oranges" from the inventory
        inventoryCounter.removeFromInventory("Oranges", 2);
        // Check if the count of "Oranges" in the inventory has decreased to 5
        assertEquals(5, inventoryCounter.getInventory().get("Oranges"));

        // Try to remove 10 "Oranges" from the inventory
        inventoryCounter.removeFromInventory("Oranges", 10);
        // Check if the count of "Oranges" in the inventory is now 0 (not negative)
        assertEquals(0, inventoryCounter.getInventory().get("Oranges"));
    }

    // Define a test case for removing a product that isn't in the inventory
    @Test
    void testRemoveFromInventoryForNonExistentProduct() {
        // Ensure "Bananas" are not present in the inventory to start with
        assertNull(inventoryCounter.getInventory().get("Bananas"));

        // Try to remove 5 "Bananas" from the inventory
        inventoryCounter.removeFromInventory("Bananas", 5);
        // Confirm that "Bananas" still don't exist in the inventory after the operation
        assertNull(inventoryCounter.getInventory().get("Bananas"));
    }
}
