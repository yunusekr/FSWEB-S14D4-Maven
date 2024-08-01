package org.example.model;

public class Chocolate extends ProductForSale{

    private double bitterRate;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.bitterRate = 20;
    }

    @Override
    public void showDetails() {
        System.out.println("bu çikolatadaki bitter oranı:" + bitterRate);
    }
}
