package com.codedifferently.labs.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerishableItemTest {
    @Test
    public void testPerishableItemBilling() {
        PerishableItem banana = new PerishableItem("Banana", 0.5, 0.8); // 80% fresh
        assertEquals(0.5, banana.getPrice());
        assertEquals(0.1, banana.getDiscount()); // 20% of base price because 20% not fresh
        assertEquals(0, banana.getTax());
        assertEquals(0.4, banana.getFinalPrice());
    }
}
