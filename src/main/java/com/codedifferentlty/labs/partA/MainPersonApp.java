package com.codedifferentlty.labs.partA;

public class MainPersonApp {
    // The main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create a new person object named Alice with age 30.
        Person alice = new Person("Alice", 30);

        // Create a new person object named Bob with age 25.
        Person bob = new Person("Bob", 25);

        // Check if Alice is older than Bob.
        if (alice.compareTo(bob) > 0) {
            System.out.println(alice.getName() + " is older than " + bob.getName());
        }
        // Check if Alice is younger than Bob.
        else if (alice.compareTo(bob) < 0) {
            System.out.println(alice.getName() + " is younger than " + bob.getName());
        }
        // If neither of the above conditions is met, then Alice and Bob are of the same age.
        else {
            System.out.println(alice.getName() + " and " + bob.getName() + " are of the same age.");
        }
    }
}
