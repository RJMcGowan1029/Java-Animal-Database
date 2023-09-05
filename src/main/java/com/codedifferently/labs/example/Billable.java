package com.codedifferently.labs.example;

public interface Billable {
    String getName();
    double getPrice();
    String getProductName();
    double getDiscount();
    double getTax();
    default double getFinalPrice() {
        return (getPrice() + getTax() - getDiscount());
    }
}
