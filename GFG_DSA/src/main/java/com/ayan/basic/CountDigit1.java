package com.ayan.basic;

public class CountDigit1 {

    public static int recursiveDigitCount(int n) {
        if(n==1 || n==0) {
            return n;
        }
        return 1+recursiveDigitCount(n/10);
    }

    private static int iterativeDigitCount(int n) {
        int c=0;
        while(n!=0) {
            c++;
            n/=10;
        }
        return c;
    }

    public static void main(String[] args) {
        int n= 678913;
        System.out.println(recursiveDigitCount(n));
        System.out.println(iterativeDigitCount(n));
    }
}
