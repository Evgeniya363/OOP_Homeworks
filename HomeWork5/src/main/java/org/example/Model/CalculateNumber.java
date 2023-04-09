package org.example.Model;

public class CalculateNumber<T extends Number> {
    protected T rational;

    public CalculateNumber(T rational) {
        this.rational = rational;
    }

    public T getRational() {
        return rational;
    }
}
