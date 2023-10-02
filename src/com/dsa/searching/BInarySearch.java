package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BInarySearch {

    private static int binarySearch(int[] arr, int n){
        int l=0, h=arr.length;

        while(l<h){
            System.out.println("--".repeat(20));
            for(int i=l; i<h; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("--".repeat(20));
            System.out.println("high : low - "+l+" : "+h);
            int mid= (l+h)/2;
            if(arr[mid]==n){
                return mid;
            }
            System.out.println(mid+" : arr[mid]>n : "+arr[mid]+">"+n+" : "+(arr[mid]>n));
            if(arr[mid]<n){
                l=mid;
            }
            else{
                h=mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,4,5,6,8,9,12,14,25,37,55,65,78,90,100};
        System.out.println("Array: "+ Arrays.toString(arr));
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to find its index from the array:");
        int n= sc.nextInt();
        System.out.println("Index: "+binarySearch(arr, n));
    }
}
