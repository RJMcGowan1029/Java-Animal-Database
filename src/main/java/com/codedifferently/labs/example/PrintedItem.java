package com.codedifferently.labs.example;

public class PrintedItem implements Billable {
    private String productName;
    private double basePrice;
    private boolean isPromotion;

    public PrintedItem(String productName, double basePrice, boolean isPromotion) {
        this.productName = productName;
        this.basePrice = basePrice;
        this.isPromotion = isPromotion;
        //Constructor for the printed item
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
        return isPromotion ? basePrice * 0.05 : 0;  // 5% discount if on promotion.
    }

    @Override
    public double getTax() {
        return basePrice * 0.05;  // 5% tax on printed items.
    }
}

