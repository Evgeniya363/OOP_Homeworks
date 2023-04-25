package org.example.Service;

import org.example.Model.Classes.CalculatorReal;
import org.example.Model.Exeptions.CalculateFormatException;
import org.example.Model.Interfaces.Calculable;
import org.example.Model.Classes.Real;

public class CalculableRealFactory implements ICalculableFactory {
    private Calculable calc;

    public CalculableRealFactory() {
        this.calc = createCalculator();
    }

    @Override
    public Calculable createCalculator() {
        calc = new CalculatorReal();
        return calc;
    }

    @Override
    public Real createNumber(String str) throws CalculateFormatException {
        return (Real) (new Real()).parse(str);
    }

    @Override
    public Calculable getCalculator() {
        return this.calc;
    }

}
