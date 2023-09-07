package com.codedifferently.labs.example;

public class PerishableItem implements Billable {
    private String productName;
    private double basePrice;
    private double freshnessPercentage;

    public PerishableItem(String productName, double basePrice, double freshnessPercentage) {
        //Constructor for the Perishable item
        this.productName = productName;
        this.basePrice = basePrice;
        this.freshnessPercentage = freshnessPercentage;
    }

    @Override
    public String getName() {
        return productName;
    }
    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getDiscount() {
        return basePrice * (1 - freshnessPercentage);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
