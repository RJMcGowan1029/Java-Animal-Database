package com.codedifferently.labs.chapter8;

import com.codedifferently.labs.chapter8.animals.*;

import java.util.ArrayList;

public class ZooManagementSystem {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Create Lions
        Lion simba = new Lion("Simba","Deer",true,"Roar!" );
        animals.add(simba);

        // Create Birds
        Bird cuh = new Bird("Cuh","Worms", false, "Tweet!");
        animals.add(cuh);

        // Create Fish
        Fish nemo = new Fish("Nemo","Bait", false, "Bloop!");
        animals.add(nemo);

        // Create Elephants
        Elephant dumbo = new Elephant("Dumbo", "Grass", false, "Trumpet!");
        animals.add(dumbo);

        // Create Monkeys
        Monkey george = new Monkey("George","Bananas", false, "Chatter!");
        animals.add(george);

        // Create Snakes
        Snake viper = new Snake("Viper", "Mice", false, "Hiss!");
        animals.add(viper);

        for(Animal animal: animals ){
            System.out.println(animal.getName() + " is eating "+ animal.eat() + "\n" + " The food so good that " + animal.getName() +" wants to " +animal.makeSound());
        }

    }
}
