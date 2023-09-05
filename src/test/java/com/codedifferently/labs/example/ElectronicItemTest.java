package com.codedifferently.labs.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicItemTest {
    @Test
    public void testElectronicItemBilling() {
        ElectronicItem battery = new ElectronicItem("Battery", 5.0);
        assertEquals(5.0, battery.getPrice());
        assertEquals(0, battery.getDiscount());
        assertEquals(0.5, battery.getTax()); // 10% of base price
        assertEquals(5.5, battery.getFinalPrice());
    }
}
