package com.dsa.recursion;

public class Fibonacci {

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

//    n-th number in series
    public static void fibonacciWithoutRecursion(int n){
        if(n<0){
            System.out.println(-1);
            System.exit(4040);
        }
        int a=0;
        int b=1;
        int res=0;
        System.out.print(0);
        while(n!=0) {
            res = a + b;
            a = b;
            b = res;
            System.out.print(" "+res);
            n--;
        }
        System.out.println();
//        while(res<n) {
//            res = a + b;
//            a = b;
//            b = res;
//            System.out.println(res);
//        }
    }

    public static void main(String[] args) {
        int number= 8;
        fibonacciWithoutRecursion(number);

        System.out.println(fibonacci(number+1));

    }
}
