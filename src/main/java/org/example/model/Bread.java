package org.example.model;

public class Bread extends ProductForSale{

    private double branRate;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.branRate = 30;
    }

    @Override
    public void showDetails() {
        System.out.println("bu ekmekteki kepek oranı:" + branRate);
    }
}
