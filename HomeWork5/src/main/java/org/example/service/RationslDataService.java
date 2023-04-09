package org.example.service;

import org.example.Model.CalculateNumber;

public class RationslDataService implements DataOperation {
    @Override
    public CalculateNumber summa(CalculateNumber number1, CalculateNumber number2) {
        return new CalculateNumber(number1.getRational().doubleValue() + number2.getRational().doubleValue());
    }

    @Override
    public CalculateNumber subtraction(CalculateNumber number1, CalculateNumber number2) {
        return new CalculateNumber(number1.getRational().doubleValue() - number2.getRational().doubleValue());
    }

    @Override
    public CalculateNumber multiply(CalculateNumber number1, CalculateNumber number2) {
        return new CalculateNumber(number1.getRational().doubleValue() * number2.getRational().doubleValue());
    }

    @Override
    public CalculateNumber division(CalculateNumber number1, CalculateNumber number2) {
        double dev = number2.getRational().doubleValue();
        if (dev == 0) {
            System.out.println("Деление на 0");
            return null;
        } else {
            return new CalculateNumber(number1.getRational().doubleValue() / dev);
        }
    }

}
