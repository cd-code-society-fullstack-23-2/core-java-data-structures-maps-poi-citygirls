package com.codedifferentlty.labs.partA;

// This is the definition of the Person class, which also implements the Comparable interface.
public class Person implements Comparable<Person> {

    // Declare a private string variable for the name.
    private String name;

    // Declare a private integer variable for the age.
    private int age;

    // This is the constructor of the Person class. It initializes the name and age of the person.
    public Person(String name, int age) {
        // 'this.name' refers to the name variable of the class, and 'name' is the parameter passed to the constructor.
        this.name = name;

        // 'this.age' refers to the age variable of the class, and 'age' is the parameter passed to the constructor.
        this.age = age;
    }

    // This is a getter method that returns the name of the person.
    public String getName() {
        return name;
    }

    // This is a getter method that returns the age of the person.
    public int getAge() {
        return age;
    }

    // This method overrides the compareTo method of the Comparable interface.
    @Override
    public int compareTo(Person other) {
        // This line compares the age of the current person with the age of another person.
        // It returns a negative value if this.age < other.age, zero if they are equal, and a positive value otherwise.
        return Integer.compare(this.age, other.age);
    }

    // This method overrides the default toString method, providing a custom string representation of the person.
    @Override
    public String toString() {
        return name + ", " + age + " years old";
    }


}
