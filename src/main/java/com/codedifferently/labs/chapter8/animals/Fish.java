package com.codedifferently.labs.chapter8.animals;

public class Fish implements Animal{
    private String fishName;
    private String fishEats;
    private Boolean fishSleeps;
    private String fishSound;
    public Fish(String fishName,String fishEats, Boolean fishSleeps, String fishSound){
        this.fishName = fishName;
        this.fishEats = fishEats;
        this.fishSleeps = fishSleeps;
        this.fishSound = fishSound;
    }
    @Override
    public String getName(){
        return fishName;
    }
    @Override
    public String eat(){
        return fishEats;
    }
    @Override
    public Boolean sleep(){
        return fishSleeps;
    }
    @Override
    public String makeSound(){
        return fishSound;
    }
}
