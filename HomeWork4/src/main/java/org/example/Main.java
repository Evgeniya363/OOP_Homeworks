package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(4.35);
            list.add(random.nextDouble()*100);
            list2.add(i);
        }
        System.out.println(list);
        System.out.println(list2);
        System.out.println("Сумма вещественных чисел = " + calculator.sum(list));
        System.out.println("Сумма целых чисел = " + calculator.sum(list2));
        System.out.println("Произведение вещественных чисел = " + calculator.mult(list));
        System.out.println("Произведение целых чисел = " + calculator.mult(list2));
        System.out.println("Произведение обратных величин вещественных чисел = " + calculator.div(list));
        System.out.println("Произведение обратных величин целых чисел = " + calculator.div(list2));
        System.out.println();

        list.set(0,10.0);
        list2.set(0,10);
        System.out.println(list);
        System.out.println(list2);
        System.out.println("Произведение вещественных чисел = " + calculator.mult(list));
        System.out.println("Произведение целых чисел = " + calculator.mult(list2));
        System.out.println("Произведение обратных величин вещественных чисел = " + calculator.div(list));
        System.out.println("Произведение обратных величин целых чисел = " + calculator.div(list2));
        System.out.println();

        System.out.println("Преобразование десятичных чисел в двоичнные");
        Object[] object = {-15.8822, -0b101010, 1999.0, 225.64f, "225.0","-4554.0222","8192","",0};
        for (int i = 0; i < object.length; i++) {
            if (object[i] instanceof String)  {
                System.out.printf("%s = %s\n", object[i].toString(), calculator.toBinaryString((String) object[i]));
            } else {
                System.out.printf("%s = %s\n", object[i].toString(), calculator.toBinaryString((Number) object[i]));
            }
        }
    }
}