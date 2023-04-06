package org.example;

import java.util.ArrayList;

public class User {
    private String user;
    private String password;
    private Basket basket;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
        this.basket = new Basket();
    }

    public String getUser() {
        return user;
    }

    /**
     * @apiNote Method that adds a product to the customer's cart and removes it from the category containing it
     * @param product being sold
     * @param list of categories containing the product
     * @return
     */
    public boolean bue(Product product, ArrayList<Category> category){
        for (var cat: category) {
            for (var prod:  cat.product) {
                if (product.equals(prod)) {
                    this.basket.addProduct(cat.removeProduct(product));
                    return true;
                }
            }
        }
        System.out.println("The product is missing");
        return false;
    }

    @Override
    public String toString() {
        return "User (count=" + basket.getSize() +
                "){ user='" + user + '\'' +
                ", basket=" + basket +
                '}';
    }
}
