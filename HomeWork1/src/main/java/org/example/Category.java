package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    ArrayList<Product> product;

    public Category(String name) {
        this.name = name;
        this.product = new ArrayList<>();
    }

    public Category(String name, Product... product) {
        this.name = name;
        this.product = new ArrayList<>();
        for (var prod : product) {
            this.product.add(prod);
        }
    }

    public Category(String name, ArrayList<Product> product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param added product
     * @apiNote Method of adding a product to a category
     */
    public void addProduct(Product product) {
        this.product.add(product);
    }

    /**
     * @param product being removed
     * @return remote product
     * @apiNote Method of removing an item from this category
     */
    public Product removeProduct(Product product) {
        this.product.remove(product);
        return product;
    }

    @Override
    public String toString() {
        return "Category (count=" +
                product.size() +
                ") { name='" + name + '\'' +
                ", product=" + product +
                " }";
    }
}
