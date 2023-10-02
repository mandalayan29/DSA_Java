package com.ayan.basic;

public class FindDivisor {

    public static void findAllDivisors(int n) {

        for(int i=1; i<= Math.sqrt(n); i++) {
            if(n%i==0) {
                System.out.print(i+" "+n/i+" ");
                n=n/i;
            }
        }
    }

    public static void main(String[] args) {
        int n=100;
        findAllDivisors(n);
    }
}
