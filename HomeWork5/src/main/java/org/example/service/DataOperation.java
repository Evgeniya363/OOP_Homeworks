package org.example.service;

import org.example.Model.CalculateNumber;

public interface DataOperation {
    public CalculateNumber summa(CalculateNumber number1, CalculateNumber number2);
    public CalculateNumber subtraction(CalculateNumber number1, CalculateNumber number2);
    public CalculateNumber multiply(CalculateNumber number1, CalculateNumber number2);
    public CalculateNumber division(CalculateNumber number1, CalculateNumber number2);
}
