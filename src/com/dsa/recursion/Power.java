package com.dsa.recursion;

public class Power {

    public static int power(int base, int exponent){
        if(exponent==0){
            return 1;
        }
        return base* power(base, exponent-1);
    }

    public static void main(String[] args) {
        int base= 6;
        int exponent=3;
        System.out.println(power(base, exponent));
    }

}
