package com.dsa.recursion;

public class DecimalToBinary {

    public static int toBinary(int n){
        if(n==1 || n==0){
            return n;
        }
        return (n%2)+ toBinary(n/2)*10;
    }

    public static void main(String[] args) {
        int number= 0;
        System.out.println(toBinary(number));
    }
}
