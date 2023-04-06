package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> product;

    public Basket() {
        this.product = new ArrayList<>();
    }

    /**
     * @param added product
     * @apiNote Adds an item to the cart
     */
    public void addProduct(Product product) {
        this.product.add(product);
    }

    /**
     * @param product being removed
     * @return remote product
     * @apiNote Removing an item from the shopping cart
     */
    public Product removeProduct(Product product) {
        this.product.remove(product);
        return product;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "product=" + product +
                "}";
    }

    public int getSize() {
        return this.product.size();
    }
}
