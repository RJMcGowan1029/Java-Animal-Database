package com.codedifferently.labs.example;

public class ElectronicItem implements Billable {
    private String productName;
    private double basePrice;

    public ElectronicItem(String productName, double basePrice) {
        //Constructor for the electronic item
        this.productName = productName;
        this.basePrice = basePrice;
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
        return 0;
    }

    @Override
    public double getTax()   {
        return basePrice * 0.1;  // 10% electronics tax.
    }
}

