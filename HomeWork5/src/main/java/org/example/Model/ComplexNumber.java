package org.example.Model;

public class ComplexNumber<T extends Number> extends CalculateNumber { ;
    private T complex;

    public ComplexNumber(T rational, T complex) {
        super(rational);
        this.complex = complex;
    }

    public T getComplex() {
        return complex;
    }
}
