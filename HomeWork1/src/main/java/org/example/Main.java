package org.example;
// Домашнее задание на закрепление:
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        ArrayList<Category> category = new ArrayList<>();

        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("Beef", 15.0f, 9.8f));
        product.add(new Product("Pork", 10.0f, 5.4f));
        product.add(new Product("Horse meat", 20.0f, 8.5f));
        category.add(new Category("Meat products", new ArrayList<>(product.subList(0,3))));

        product.add(new Product("Peaches", 14.0f, 8.1f));
        product.add(new Product("Cherries", 15.0f, 6.4f));
        product.add(new Product("Grapes", 12.0f, 5.5f));
        product.add(new Product("Apples", 10.0f, 9.7f));
        category.add(new Category("Fruit", new ArrayList<>(product.subList(3,7))));

        product.add(new Product("Milk", 15.0f, 7.4f));
        product.add(new Product("Cheese", 25.0f, 5.9f));
        product.add(new Product("Butter", 22f, 5.8f));
        product.add(new Product("Sour cream", 19.0f, 6.7f));
        category.add(new Category("Dairy products", new ArrayList<>(product.subList(7,11))));

        product.add(new Product("Vermicelli", 14.0f, 8.1f));
        product.add(new Product("Spaghetti", 15.0f, 6.4f));
        product.add(new Product("Pasta", 11.0f, 7.7f));
        category.add(new Category("Pasta", product.get(11),product.get(12)));   // Another constructor
        category.get(3).addProduct(product.get(13));

        user.add(new User("Ann","12345"));
        user.add(new User("Bob","220202"));
        user.add(new User("Kat","123212"));

        System.out.println("\nData output before making a sale");
        category.forEach(n -> System.out.println(n));
        user.forEach(n -> System.out.println(n));

        user.get(0).bue(product.get(0), category);
        user.get(1).bue(product.get(4), category);
        user.get(2).bue(product.get(5), category);
        user.get(0).bue(product.get(7), category);
        user.get(1).bue(product.get(9), category);
        user.get(2).bue(product.get(6), category);
        user.get(0).bue(product.get(1), category);
        user.get(0).bue(product.get(11), category);
        user.get(2).bue(product.get(3), category);
        user.get(0).bue(product.get(4), category); // Купить товар дважды невозможно: вывод сообщения

        System.out.println("\nData output after making a sale");
        category.forEach(n -> System.out.println(n));
        user.forEach(n -> System.out.println(n));
    }
}