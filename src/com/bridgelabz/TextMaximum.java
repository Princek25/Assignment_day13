package com.bridgelabz;

public class TextMaximum {
    public static void main(String[] args) {
        int a = 300;
        int b = 200;
        int c = 100;
        int temp;
        int temp1;
        temp = a > b ? a:b;
        temp1 = temp >c ? temp:c;
        System.out.println("Maximum number among 3 integers: " + temp1);
    }
}
