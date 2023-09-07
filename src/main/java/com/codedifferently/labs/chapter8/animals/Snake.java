package com.codedifferently.labs.chapter8.animals;

public class Snake implements Animal{
    private String snakeName;
    private String snakeEats;
    private Boolean snakeSleeps;
    private String snakeSound;

    public Snake(String snakeName, String snakeEats,Boolean snakeSleeps,String snakeSound){
        this.snakeName = snakeName;
        this.snakeEats = snakeEats;
        this.snakeSleeps = snakeSleeps;
        this.snakeSound = snakeSound;
    }

    @Override
    public String getName(){
            return snakeName;
    }
    @Override
    public String eat() {
        return snakeEats;
    }

    @Override
    public Boolean sleep() {
        return snakeSleeps;
    }

    @Override
    public String makeSound() {
        return snakeSound;
    }
}
