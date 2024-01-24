package com.ayan.array;

import java.util.Arrays;

public class LeftRotateWithDPlaces {

    public static void rotateArray1(int[] arr, int d) {
        int[] temp= new int[d];
        int l= arr.length;
        for(int i=0; i<d; i++) {
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<l-d; i++) {
            arr[i]= arr[d+i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<d; i++) {
            arr[l-d+i]= temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void rotateArray2(int[] arr, int d) {
        int len= arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<d-1; i++) {
            int temp= arr[d-i-1];
            arr[d-i-1]= arr[i];
            arr[i]= temp;
        }
//
        for(int i=d; i<len-1; i++) {
            int temp= arr[len-i-1];
            arr[len-i-1]= arr[i];
            arr[i]= temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
//        rotateArray1(arr, 2);
        rotateArray2(arr,2);
//        System.out.println(Arrays.toString(arr));
    }
}
