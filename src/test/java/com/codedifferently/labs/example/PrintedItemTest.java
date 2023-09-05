package com.codedifferently.labs.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintedItemTest {
    @Test
    public void testPrintedItemBilling() {
        PrintedItem magazine = new PrintedItem("Magazine", 10.0, true); // is on promotion
        assertEquals(10.0, magazine.getPrice());
        assertEquals(0.5, magazine.getDiscount()); // 5% of base price because on promotion
        assertEquals(0.5, magazine.getTax()); // 5% of base price
        assertEquals(10.0, magazine.getFinalPrice());
    }
}
