package com.dsa.array;

import java.util.Arrays;
import java.util.Random;

public class MargeSortedArray {

    public static int[] getNewArray(int n){
        Random r= new Random();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= r.nextInt(100);
        }
        return arr;
    }

    public static int[] margeArray(int[] a, int[] b){
        int[] c= new int[a.length+b.length];
        int i=0, j=0, k=0;

        while( i<a.length && j<b.length ){
            if(a[i]<=b[j]){
                c[k++]= a[i++];
            }
            else{
                c[k++]= b[j++];
            }
        }
        for( ; i<a.length; ){
            c[k++]= a[i++];
        }
        for( ; j<b.length; ){
            c[k++]= b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr1= getNewArray(5);
        int[] arr2= getNewArray(7);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        int[] arr= margeArray(arr1, arr2);

        System.out.println(Arrays.toString(arr));


    }
}
