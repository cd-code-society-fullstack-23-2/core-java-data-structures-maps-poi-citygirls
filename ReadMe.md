# Introduction to Java, Data Structures, and Maps.

---

**What are Data Structures?**

Let's think about a library. A library is filled with books, but if they were all jumbled up, it would be a nightmare to find the one you want, right? That's why libraries have shelves, sections, and catalogs. In computer terms, the way we organize these books is like a **data structure**. So, a data structure is simply a way to organize and store information (or data) so that we can easily use and manage it.

---

**Okay, but what is a Map?**

Imagine you have a big box of toys, and each toy has a label with its name. If you want to find your "Spiderman" action figure, you'd look for the label "Spiderman" and grab that toy. A **Map** in programming is a bit like that box of toys with labels.

In a Map, for every "label" (which we call a **key**), there is a piece of information or data attached to it (called a **value**). So, if our key is "Spiderman", the value might be the actual action figure. This makes it super easy to find and manage information because all you need is the key, and you can quickly get its associated value!

[Watch this video](https://www.youtube.com/watch?v=0dR-YAFFg6I)

---

So, in summary:

- **Data structures** are the ways we keep our computer's information neat and tidy.
- And a **Map** is like a magical box where you can quickly find toys (or data) based on their labels (or keys).

With these basics, you're on your way to diving deeper into the fascinating world of programming and computer science!


## Lab Assignment: City Guide - Points of Interest (POI) Finder


---

### Objective:
In this lab, students will:

1. Develop a console-based application to find and rate points of interest (POI) in a city.
2. Research the utilization of Maps in Java through various resources.
3. Integrate TDD methodology into their development process.
4. Design UML diagrams for the application.
5. Develop a comprehensive testing plan for the application.
6. Gain approval of the testing plan from the instructor before initiating the coding phase.

The exercise aims to introduce the core concepts of Java, especially the use of Maps for data storage and retrieval, combined with TDD methodology.

### Requirements:

- Java SDK
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Junit5 for testing
- Basic understanding of Java programming, data structures, and I/O operations (for the advanced part).

### Scenario:

City Guide is a console application allowing users to discover and rate various points of interest in their city. It provides functionalities like adding a new POI, searching for a POI by name, rating a POI, listing all POIs, and deleting a POI.

### Example Usage:

```
Welcome to City Guide - Points of Interest (POI) Finder!
========================================================

1. Add a new POI
2. Search for a POI by name
3. Rate a POI
4. List All POIs
5. Delete a POI
6. Exit

Please enter your choice: 1

Add a new POI:
---------------
Enter POI Name: City Park
Enter POI Address: 123 Green Street
Enter POI Description: A spacious park with a lake and walking trails.

POI 'City Park' added successfully!

1. Add a new POI
2. Search for a POI by name
3. Rate a POI
4. List All POIs
5. Delete a POI
6. Exit

Please enter your choice: 3

Rate a POI:
-----------
Enter POI Name to rate: City Park
Enter your name: Alice
Rate the POI (1-5): 5

Thank you, Alice! You rated 'City Park' 5/5.

1. Add a new POI
2. Search for a POI by name
3. Rate a POI
4. List All POIs
5. Delete a POI
6. Exit

Please enter your choice: 4

List All POIs:
--------------
1. City Park - 123 Green Street - A spacious park with a lake and walking trails. (Avg. Rating: 5/5 by 1 user)

1. Add a new POI
2. Search for a POI by name
3. Rate a POI
4. List All POIs
5. Delete a POI
6. Exit

Please enter your choice: 2

Search for a POI by name:
--------------------------
Enter POI Name: City Park

Details:
-------
Name: City Park
Address: 123 Green Street
Description: A spacious park with a lake and walking trails.
Rating: 5/5 by 1 user (Rated by Alice)

1. Add a new POI
2. Search for a POI by name
3. Rate a POI
4. List All POIs
5. Delete a POI
6. Exit

Please enter your choice: 6

Thank you for using City Guide - Points of Interest (POI) Finder! Have a great day!

```

### Research Phase:

#### Task 1: Research on Maps in Java

- Use YouTube, Google Search, textbooks, and other preferred resources to understand the concept and implementation of Maps in Java.
- Document key takeaways and be prepared to discuss your findings.

#### Task 2: Testing Maps with Junit5

- Investigate how to test Maps using Junit5.
- Document the steps, methodologies, and any tools or plugins needed for the testing.

#### Task 3: Design UML for Application

- Develop UML diagrams for the City Guide application, detailing classes, relationships, attributes, and operations.

#### Task 4: Testing Plan Creation

- Draft a comprehensive testing plan detailing how you will test the different components and functionalities of the application. This will guide your TDD process.

#### Task 5: Get Instructor Approval

- Present your testing plan to the instructor for review and approval before moving on to the TDD phase.

### TDD Implementation Phase:

#### Task 6: Design the POI Class & Tests
**Implementer**:

1. Start by writing Junit tests for the `POI` class, focusing on its expected behaviors.
2. Develop the `POI` class. Iterate between coding and testing until all tests pass.

#### Task 7: Add and Store POI Data & Tests
**Implementer**:

1. Write tests for adding and storing POI data.
2. Implement the functionality, iterating between coding and testing until all tests pass.

#### Task 8: Search, Rate, List, and Delete POI & Tests
**Implementer**:

1. Draft tests for each of these functionalities.
2. Implement the functionalities, iterating between testing and coding.

#### Task 9: Data Persistence (Advanced) & Tests
**Implementer**:

1. Initiate with tests for file input/output operations.
2. Implement the feature, ensuring data is correctly saved and retrieved across sessions.

### Final Testing Phase:

#### Task 10: Comprehensive Testing
**Test Driver**:
- With the application complete, run an overall test to ensure all functionalities work seamlessly together.
- Check edge cases, such as entering a POI that already exists or searching for a nonexistent POI.

### Wrap-up:

Upon completing the tasks, students should possess a basic City Guide application developed using TDD. They will have enhanced their skills in Java programming, data structure manipulation, TDD, and (for the advanced task) file I/O operations.

### Real-World Application:

This lab mirrors the features of platforms like TripAdvisor or Yelp in a simplified form. Students will appreciate the utility of maps in data organization and retrieval and experience real-world software development scenarios where data structures and TDD methodology facilitate user-generated content management.

---

**Submission Guidelines**:

- Ensure your code is well-commented, explaining any complex logic.
- Save and submit your project files, research notes, UML diagrams, and the testing plan, along with any additional documentation, as a compressed folder.