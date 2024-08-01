package org.example.model;

public class Coke extends ProductForSale{

    private double sugarRate;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.sugarRate = 40;
    }

    @Override
    public void showDetails() {
        System.out.println("bu koladaki şeker oranı:" + sugarRate);
    }
}
