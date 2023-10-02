package com.ayan.basic;

public class TrailingZeroInFactorial {

    public static int countZeroInFactorial(int n) {
        int c=0;
        for(int i=1; i<= n; i=i*5 ) {
            System.out.println(i);
            int temp=i;
            while(temp%5==0 ) {
                c++;
                temp/=5;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n= 120;
        System.out.println(countZeroInFactorial(n));
    }
}
