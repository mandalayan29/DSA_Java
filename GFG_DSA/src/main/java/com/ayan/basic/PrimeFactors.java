package com.ayan.basic;

public class PrimeFactors {

    public static void primeFactors(int n) {
        if(n%2==0 ){
            n/=2;
            System.out.println(2);
        }
        if(n%3==0 ){
            n/=3;
            System.out.println(3);
        }

        for(int i=5; i<Math.sqrt(n); i= i+6) {
            if(n%i==0 ) {
                n/=i;
                System.out.println(i);
            }
            else if(n%(i+2)==0) {
                n/=(i+2);
                System.out.println(i+2);
            }
        }
    }

    public static void main(String[] args) {
        int n= 69;
        primeFactors(n);
    }
}
