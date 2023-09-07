package com.codedifferently.labs.chapter8.animals;

public class Monkey implements Animal{
    private String monkeyName;
    private String monkeyEats;
    private Boolean monkeySleeps;
    private String monkeySound;

    public Monkey(String monkeyName, String monkeyEats,Boolean monkeySleeps,String monkeySound){
        this.monkeyName = monkeyName;
        this.monkeyEats = monkeyEats;
        this.monkeySleeps = monkeySleeps;
        this.monkeySound = monkeySound;
    }


    @Override
    public String getName(){
        return monkeyName;
    }
    @Override
    public String eat() {
        return monkeyEats;
    }

    @Override
    public Boolean sleep() {
        return monkeySleeps;
    }

    @Override
    public String makeSound() {
        return monkeySound;
    }


}
