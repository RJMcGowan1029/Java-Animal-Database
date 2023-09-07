package com.codedifferently.labs.chapter8.animals;

public class Lion implements Animal{
    private String lionName;
    private String lionEats;
    private Boolean lionSleeps;
    private String lionSound;

    public Lion(String lionName, String lionEats,Boolean lionSleeps,String lionSound){
        this.lionName = lionName;
        this.lionEats = lionEats;
        this.lionSleeps = lionSleeps;
        this.lionSound = lionSound;
    }


    @Override
    public String getName(){
        return lionName;
    }
    @Override
    public String eat() {
        return lionEats;
    }

    @Override
    public Boolean sleep() {
        return lionSleeps;
    }

    @Override
    public String makeSound() {
        return lionSound;
    }

}
