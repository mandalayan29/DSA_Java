package com.ayan.bitmanipulation;

public class PowerOfTwo {

    public static int powerOfTwo(int n) {
        return 2<<(n-1);
    }

    public static void main(String[] args) {
        for(int i=0; i< 10; i++) {
            System.out.println(powerOfTwo(i));
        }
    }
}
