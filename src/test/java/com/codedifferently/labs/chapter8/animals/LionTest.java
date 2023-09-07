package com.codedifferently.labs.chapter8.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {
    @Test
    public void testLion01(){
        Lion simba = new Lion("simba","Deer", false, "Roar!");
        assertEquals("Deer", simba.eat());
        assertEquals(false, simba.sleep());
        assertEquals("Roar!", simba.makeSound());
    }
    @Test
    public void testBird01(){
        Bird cuh = new Bird("cuh", "Worms", false, "Tweet!");
        assertEquals("Worms", cuh.eat());
        assertEquals(false, cuh.sleep());
        assertEquals("Tweet!", cuh.makeSound());
    }
    @Test
    public void testFish01(){
        Fish nemo = new Fish("nemo","Bait", false, "Bloop!");
        assertEquals("Bait", nemo.eat());
        assertEquals(false,nemo.sleep());
        assertEquals("Bloop!", nemo.makeSound());
    }
    @Test
    public void testElephant01(){
        Elephant dumbo = new Elephant("dumbo","Grass", false, "Trumpet!");
        assertEquals("Grass", dumbo.eat());
        assertEquals(false,dumbo.sleep());
        assertEquals("Trumpet!", dumbo.makeSound());
    }
    @Test
    public void testMonkey01(){
        Monkey george = new Monkey("george","Bananas", false, "Chatter!");
        assertEquals("Bananas", george.eat());
        assertEquals(false,george.sleep());
        assertEquals("Chatter!", george.makeSound());
    }
    @Test
    public void testSnake01(){
        Snake viper = new Snake("viper","Mice", false, "Hiss!");
        assertEquals("Mice", viper.eat());
        assertEquals(false,viper.sleep());
        assertEquals("Hiss!", viper.makeSound());
    }
}
