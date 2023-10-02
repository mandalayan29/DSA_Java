package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    static int count=0;

    public static int binarySearchRecursion(int[] arr, int n, int l, int h){
        System.out.println("Count : "+ ++count);
        if(l<=h){
            int m= (l+h)/2;
            if(arr[m]==n){
                return m;
            }
            else if(arr[m]<n){
                return binarySearchRecursion(arr, n, m+1, h);
            }
            else if(arr[m]>n){
                return binarySearchRecursion(arr, n, l, m-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,4,5,6,8,9,12,14,25,37,55,65,78,90,100};
        System.out.println("Array: "+ Arrays.toString(arr));
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter number to find its index from the array:");
//        int n= sc.nextInt();
        int n=100;
        System.out.println("Index: "+binarySearchRecursion(arr, n, 0, (arr.length-1)));
    }
}
