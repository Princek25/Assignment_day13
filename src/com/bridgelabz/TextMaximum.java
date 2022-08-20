package com.bridgelabz;

public class TextMaximum {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        int c = 100;
        int temp;
        int temp1;
        temp = a > b ? a:b;
        temp1 = temp >c ? temp:c;
        System.out.println(temp1);
    }
}
