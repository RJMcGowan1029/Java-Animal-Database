package com.codedifferently.labs.example;

public interface Billable {
    //setting an interface, so we can access its objects
    String getName();
    //defining a getter to use this information when defined
    double getPrice();
    //defining a getter to use this information when defined
    String getProductName();
    //defining a getter to use this information when defined
    double getDiscount();
    //defining a getter to use this information when defined
    double getTax();
    //defining a getter to use this information when defined
    default double getFinalPrice() {
        return (getPrice() + getTax() - getDiscount());
        //defining a double that will add the price and tax and subtract the discount
    }
}
