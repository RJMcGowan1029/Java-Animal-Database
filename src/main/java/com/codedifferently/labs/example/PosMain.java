package com.codedifferently.labs.example;

import java.util.ArrayList;

public class PosMain {
    public static void main(String[] args) {
        ArrayList<Billable> billables = new ArrayList<>();

        // Create Perishable Items
        PerishableItem milk = new PerishableItem("Milk", 2.5, 80);  // 80% fresh
        PerishableItem bread = new PerishableItem("Bread", 1.0, 60);  // 60% fresh
        billables.add(milk);
        billables.add(bread);

        // Create Electronic Items
        ElectronicItem headphones = new ElectronicItem("Headphones", 50.0);
        ElectronicItem charger = new ElectronicItem("Charger", 15.0);
        billables.add(headphones);
        billables.add(charger);

        // Create Printed Items
        PrintedItem magazine = new PrintedItem("Fashion Mag", 5.0, true);  // On promotion
        PrintedItem book = new PrintedItem("Java for Beginners", 20.0, false);  // Not on promotion
        billables.add(magazine);
        billables.add(book);

        // Display items and their final prices
        for(Billable billable: billables){
            System.out.println(billable.getName() + " Final Price: $" + billable.getFinalPrice());
        }

    }
}
