package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale product = new Chocolate("test",3,"çikolatalaaar");
        ProductForSale product1 = new Coke("test1",5,"kolalaaaaar");
        ProductForSale product2 = new Bread("test2",10,"ekmekleeeeeer");
        ProductForSale[] products = {product,product1,product2};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale prod : products){
            prod.showDetails();
        }
    }
}