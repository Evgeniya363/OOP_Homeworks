package org.example;

import org.example.Model.CalculateNumber;
import org.example.service.NumberOperation;
import org.example.service.RationslDataService;

public class Main {
    public static void main(String[] args) {
        CalculateNumber c1 = new CalculateNumber<>(10);
        CalculateNumber c2 = new CalculateNumber<>(20);
        RationslDataService rt = new RationslDataService();
        System.out.println(rt.summa(c1,c2).getRational());
    }

}