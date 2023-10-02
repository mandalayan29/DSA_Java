package com.dsa.recursion;

public class ProductOfArray {
//    parameters are array and length
    public static int productOfArray(int[] a, int n){
        if(n==0){
            return a[0];
        }
        return a[n-1] * productOfArray(a, n-1);
    }

    public static void main(String[] args) {
        int[] a=  {1,2,3,4,5,6,};
        System.out.println(productOfArray(a, a.length));
    }
}
