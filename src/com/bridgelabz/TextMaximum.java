package com.bridgelabz;

public class TextMaximum {
    public static void main(String[] args) {
        float a = 200.25f;
        float b = 100.25f;
        float c = 300.65f;
        float temp;
        float temp1;
        temp = a > b ? a:b;
        temp1 = temp >c ? temp:c;
        System.out.println("Maximum number among 3 float number: " + temp1);
    }
}
