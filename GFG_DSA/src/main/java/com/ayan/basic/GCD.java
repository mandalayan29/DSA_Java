package com.ayan.basic;

public class GCD {

    public static int recursiveGCD(int n1, int n2) {
        if(n1%n2==0) {
            return n2;
        }
        return recursiveGCD(n2, n1%n2);
    }

    public static void main(String[] args) {
        int n1=39;
        int n2=65;
        System.out.println(recursiveGCD(n1, n2));
    }
}
