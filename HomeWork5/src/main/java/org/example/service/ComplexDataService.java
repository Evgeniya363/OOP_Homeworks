package org.example.service;

import org.example.Model.CalculateNumber;
import org.example.Model.ComplexNumber;

public class ComplexDataService implements DataOperation {

    @Override
    public CalculateNumber summa(CalculateNumber number1, CalculateNumber number2) {
        return new ComplexNumber(number1.getRational().doubleValue() + number2.getRational().doubleValue(),
                ((ComplexNumber) number2).getRational().doubleValue() + ((ComplexNumber) number2).getComplex().doubleValue());
    }

    @Override
    public CalculateNumber subtraction(CalculateNumber number1, CalculateNumber number2) {
        return new ComplexNumber(number1.getRational().doubleValue() - number2.getRational().doubleValue(),
                ((ComplexNumber) number2).getRational().doubleValue() - ((ComplexNumber) number2).getComplex().doubleValue());
    }

    @Override
    public CalculateNumber multiply(CalculateNumber number1, CalculateNumber number2) {
        return new ComplexNumber(number1.getRational().doubleValue() * number2.getRational().doubleValue(),
                ((ComplexNumber) number2).getRational().doubleValue() * ((ComplexNumber) number2).getComplex().doubleValue());
    }

    @Override
    public CalculateNumber division(CalculateNumber number1, CalculateNumber number2) {
        double div1 = number2.getRational().doubleValue();
        double div2 =((ComplexNumber) number2).getComplex().doubleValue();
        return new ComplexNumber(number1.getRational().doubleValue() / div1,
                ((ComplexNumber) number2).getRational().doubleValue() / div2);
    }
}
