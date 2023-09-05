# Chapter 8A
### Pre-Lab Video Viewing Instructions

Please adhere to the following guidelines:

1. **Video Engagement**:
   - Commence with the video titled **Java Polymorphism**. Access it via the following link:
     [Java Polymorphism](https://www.youtube.com/watch?v=2hkngtWLGvE&t)
   - Upon its conclusion, transition to the **Java Interfaces** video through this link:
     [Java Interfaces](https://www.youtube.com/watch?v=GhslBwrRsnw)
   - I urge you to periodically pause and revisit any segment that warrants further clarity. Mastery of these principles is vital for the impending lab.

2. **Documentation**:
   - Be proactive in cataloging pivotal concepts, elucidations, or illustrative examples.
   - Mark down any queries or ambiguities; they will be invaluable talking points during our lab.

3. **Reflection**:
   - Post-viewing, allocate a few moments for introspection on the newly acquired insights.
   - If feasible, draft a concise recapitulation of each video's major tenets.

## Part 0: Example POS system

**Grocery Store Point of Sale (POS) System**

**Instructions:**

1. Inside the `example` package, look at the `Billable` interface and implement the classes as specified above.
2. Comment each line of code explaining its purpose. This will help you understand and debug your code effectively.
3. Look at all the JUnit 5 tests and comment each line of code.

---

**User Stories:**

**1. As a grocery store owner, I want a Billable system so that I can compute the final price of different items based on their price, tax, and discount.**

- Create an interface `Billable` with the following methods:
   - `getPrice()`: Returns the price of the item.
   - `getTax()`: Returns the tax for the item.
   - `getDiscount()`: Returns any applicable discount on the item.
   - `getFinalPrice()`: Returns the final price after applying the tax and discount.

**2. As a grocery store owner, I want to categorize items as Perishable so that I can apply discounts based on freshness.**

- Create a class `PerishableItem` implementing `Billable`.
   - Contains attributes: `name`, `basePrice`, and `freshnessPercentage`.
   - Overrides all methods from `Billable` to suit perishable items.

**3. As a grocery store owner, I want to categorize items as Electronic so that I can apply tax based on electronic guidelines.**

- Create a class `ElectronicItem` implementing `Billable`.
   - Contains attributes: `name` and `basePrice`.
   - Overrides all methods from `Billable` to suit electronic items.

**4. As a grocery store owner, I want to categorize items as Printed so that I can apply promotions and taxes on magazines or books.**

- Create a class `PrintedItem` implementing `Billable`.
   - Contains attributes: `name`, `basePrice`, and `isOnPromotion`.
   - Overrides all methods from `Billable` to suit printed items.

**5. As a developer, I want to ensure my `Billable` items work correctly so that the grocery store owner can trust the computed final prices.**


## Part 1: Java Interfaces Lab: Zoo Management System

**Objective:** In this lab, you'll model a basic zoo management system using Java interfaces. You'll focus on simulating some common behaviors of zoo animals.

**User Stories:**

1. **Define Animal Interface**:
    - As a zoo manager, I want an `Animal` interface, so that I can have a consistent set of behaviors for all animals in my zoo.
    - **Requirements**:
        - Create an interface named `Animal`.
        - Add methods `eat()`, `sleep()`, and `makeSound()` to the `Animal` interface.

2. **Implement Animal Interface for Lion**:
    - As a zoo manager, I want a `Lion` class that implements the `Animal` interface, so that I can simulate the behaviors of a lion in my zoo.
    - **Requirements**:
        - Create a class named `Lion` that implements the `Animal` interface.
        - Provide concrete implementations for the `eat()`, `sleep()`, and `makeSound()` methods.
        - The `makeSound()` method should return "Roar!" when called on a `Lion` instance.

3. **Implement Animal Interface for Other Animals**:
    - As a zoo manager, I want classes for `Bird` and `Fish` that implement the `Animal` interface, so that I can simulate a variety of animal behaviors in my zoo.
    - **Requirements**:
        - Create classes named `Bird` and `Fish` that implement the `Animal` interface.
        - Provide unique implementations for the `eat()`, `sleep()`, and `makeSound()` methods based on the behavior of each animal.

4. **Write Unit Tests**:
    - As a developer, I want to write unit tests for the `Lion`, `Bird`, and `Fish` classes using JUnit5, so that I can ensure the correct behavior of my classes.
    - **Requirements**:
        - Set up a JUnit5 testing environment.
        - Write a test class `AnimalTests`.
        - Add a test method `testLionMakeSound()` to ensure the `makeSound()` method of the `Lion` class returns "Roar!".
        - Add similar test methods for the `Bird` and `Fish` classes to validate their behaviors.
        - Ensure all tests pass successfully.

**Hints/Tips**:
- Remember, interfaces define a contract but don't provide implementation details. Your animal classes will provide the specific details for each method.
- Think about the behaviors of each animal. What sound does a bird make? How might a fish "sleep"?
- Always run your tests after making changes to ensure everything still works as expected.

## Part 2 Java Interfaces Lab: Zoo Management System

---

**Objective:** Building upon the foundation you've set in the previous lab, you'll now expand the zoo by modeling additional animals using Java interfaces. You'll continue to focus on simulating common behaviors of these new zoo inhabitants.

**User Stories:**

5. **Implement Animal Interface for Elephant**:
    - As a zoo manager, I want an `Elephant` class that implements the `Animal` interface, so that I can simulate the behaviors of an elephant in my zoo.
    - **Requirements**:
        - Create a class named `Elephant` that implements the `Animal` interface.
        - Provide concrete implementations for the `eat()`, `sleep()`, and `makeSound()` methods.
        - The `makeSound()` method should return "Trumpet!" when called on an `Elephant` instance.

6. **Implement Animal Interface for Monkey**:
    - As a zoo manager, I want a `Monkey` class that implements the `Animal` interface, so that I can simulate the behaviors of a monkey in my zoo.
    - **Requirements**:
        - Create a class named `Monkey` that implements the `Animal` interface.
        - Provide concrete implementations for the `eat()`, `sleep()`, and `makeSound()` methods.
        - The `makeSound()` method should return "Chatter!" when called on a `Monkey` instance.

7. **Implement Animal Interface for Snake**:
    - As a zoo manager, I want a `Snake` class that implements the `Animal` interface, so that I can simulate the behaviors of a snake in my zoo.
    - **Requirements**:
        - Create a class named `Snake` that implements the `Animal` interface.
        - Provide concrete implementations for the `eat()`, `sleep()`, and `makeSound()` methods.
        - The `makeSound()` method should return "Hiss!" when called on a `Snake` instance.

8. **Update Unit Tests**:
    - As a developer, I want to update the unit tests for the new `Elephant`, `Monkey`, and `Snake` classes using JUnit5, so that I can ensure the correct behavior of my expanded zoo.
    - **Requirements**:
        - Update the `AnimalTests` test class.
        - Add a test method `testElephantMakeSound()` to ensure the `makeSound()` method of the `Elephant` class returns "Trumpet!".
        - Add test methods for the `Monkey` and `Snake` classes, `testMonkeyMakeSound()` and `testSnakeMakeSound()`, to validate their behaviors.
        - Ensure all tests, including the ones from Part One, pass successfully.

**Hints/Tips**:
- Consider the natural behaviors of the new animals you're implementing. Elephants are known for their trumpeting sounds, monkeys often chatter, and snakes hiss.
- Make sure to run your tests frequently, especially after introducing new animals, to catch any errors early on.

**Bonus Challenge**:
- Introduce habitats! Think about where each animal lives. Create interfaces like `Aquatic`, `Terrestrial`, and `Arboreal`. Define methods unique to each habitat, such as `swim()` for `Aquatic` animals. Implement these interfaces for appropriate animals and write corresponding unit tests.

---

Dive deeper into the world of the zoo and discover the unique behaviors of its inhabitants!