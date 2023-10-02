package com.dsa.recursion;

public class sumOfNumber {

    public static int sum(int n){
        if(n==1 || n==0){
            return n;
        }
        int s= n+ sum(n-1);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        int n= 19;
        System.out.println(
                sum(n)
        );
    }
}
