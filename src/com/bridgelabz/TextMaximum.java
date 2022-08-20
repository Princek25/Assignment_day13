package com.bridgelabz;
//Text Maximum number among 3 integer
public class TextMaximum {
    public static void main(String[] args) {
        int a = 200; // 300, 200, 100
        int b = 300;
        int c = 100;
        int temp;
        int temp1;
        temp = a > b ? a:b;
        temp1 = temp >c ? temp:c;
        System.out.println("Maximum number among 3 integers: " + temp1);
    }
}
