package com.codedifferently.labs.chapter8.animals;

public class Bird implements Animal{

    private String birdName;
    private String birdEats;
    private Boolean birdSleeps;
    private String birdSound;

    public Bird(String birdName,String birdEats, Boolean birdSleeps, String birdSound){
        this.birdName = birdName;
        this.birdEats = birdEats;
        this.birdSleeps = birdSleeps;
        this.birdSound = birdSound;
    }


    @Override
    public String getName(){
        return birdName;
    }
    @Override
    public String eat() {
        return birdEats;
    }

    @Override
    public Boolean sleep() {
        return birdSleeps;
    }

    @Override
    public String makeSound() {
        return birdSound;
    }
}
