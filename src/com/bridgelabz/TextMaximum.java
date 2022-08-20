package com.bridgelabz;

public class TextMaximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        System.out.printf("Max of %s, %s and %s is: %s\n",x,y,z,max);
        return max;
    }
    public static void main(String[] args) {
        maximum(200,300,100);
        maximum(200.25,300.65,100.25);
        maximum("Peach","Banana","Apple");
    }
}
