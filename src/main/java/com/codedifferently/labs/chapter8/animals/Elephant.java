package com.codedifferently.labs.chapter8.animals;

public class Elephant implements Animal{
    private String elephantName;
    private String elephantEats;
    private Boolean elephantSleeps;
    private String elephantSound;

    public Elephant(String elephantName, String elephantEats,Boolean elephantSleeps,String elephantSound){
        this.elephantName = elephantName;
        this.elephantEats = elephantEats;
        this.elephantSleeps = elephantSleeps;
        this.elephantSound = elephantSound;
    }

    @Override
    public String getName(){
        return elephantName;
    }
    @Override
    public String eat() {
        return elephantEats;
    }

    @Override
    public Boolean sleep() {
        return elephantSleeps;
    }

    @Override
    public String makeSound() {
        return elephantSound;
    }

}
