package com.dsa.recursion;

public class GCD {
    public static int getGCD(int n1, int n2){
        if(n1%n2==0){
            return n2;
        }
        return getGCD(n2, n1%n2);
    }

    public static void main(String[] args) {
        int n1= 4;
        int n2= 65;
        System.out.println(getGCD(n1,n2));
    }
}
