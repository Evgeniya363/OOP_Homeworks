package org.example;

public class Binary<T extends Number> {
    StringBuilder binary = new StringBuilder();

    public Binary(String strNum) {
        String sign = "";
        try {
            double doubleNum = Double.valueOf(strNum);
            if (doubleNum < 0) {
                sign = "-";
                doubleNum = -doubleNum;
            }
            long intNum = (long) doubleNum;
            intToBinary(intNum);
            this.binary.insert(0,sign+"0b");
            if (strNum.contains(".")) {
                fractionToBinary(doubleNum- intNum);
            }
        } catch (Exception e){
            System.out.print(e.getMessage());
            this.binary.append("null");
        }
    }

    public Binary(T num) {
        this(num.toString());
    }


    public String getBinaryString() {
        return binary.toString();
    }

    private void intToBinary(long intNum) {
        while (intNum > 0) {
            binary.insert(0, intNum%2);
            intNum = intNum>>1;
        }
    }

    private void fractionToBinary(double dNum) {
        binary.append('.');
        int ok = 12;
        do {
            dNum *= 2;
            binary.append((int)dNum);
            dNum = dNum-(int)dNum;
        } while (dNum > 0 && --ok > 0);
    }
}

