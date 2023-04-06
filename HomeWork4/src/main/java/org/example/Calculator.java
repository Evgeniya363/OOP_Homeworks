package org.example;

import java.util.List;

public class Calculator<T extends Number> {

    public T sum(List<T> list){
        Double summ = 0.0;
        for (Number num: list) {
            summ += num.doubleValue();
        }
        return (T) summ;
    }

    public T mult(List<T> list){
        Double mult = 1.0;
        for (Number num: list) {
            mult *= num.doubleValue();
        }
        return (T) mult;
    }

    public Double div(List<T> list){
        Double div = 1.0;
        for (Number num: list) {
            if (Math.abs(num.doubleValue()) == 0.0){
                System.out.println("Деление на ноль. Операция прервана");
                return null;
            } else {
                div /= num.doubleValue();
            }
        }
        return div;
    }

    public String toBinaryString(String num){
        Binary bynaryString = new Binary<>(num);
        return bynaryString.getBinaryString();
    }

    public String toBinaryString(T num){
        Binary bynaryString = new Binary(num);
        return bynaryString.getBinaryString();
    }
}
