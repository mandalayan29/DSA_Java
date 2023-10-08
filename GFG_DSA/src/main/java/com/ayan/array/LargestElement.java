package com.ayan.array;

import java.util.Arrays;
import java.util.Random;

public class LargestElement {

    public static int findIndexOfMaximumElement(int[] arr) {
        int max= arr[0];
        int index= 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
                index= i;
            }
        }
        return index;
    }

    public static int findIndexOfMinimumElement(int[] arr) {
        int min= arr[0];
        int index= 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<min) {
                min= arr[i];
                index= i;
            }
        }
        return index;
    }

    public static int secondMaximumElement(int[] arr) {
        int max= arr[0];
        int second= arr[0];
        int index= 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                second= max;
                max=arr[i];
                index= i;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int n= 14;
        int arr[]= new int[n];
        Random r= new Random();
        for(int i=0; i<n; i++) {
            arr[i]= r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int index= findIndexOfMaximumElement(arr);
        System.out.println("Max value index: "+index);
        System.out.println("Max Value : "+arr[index]);
        System.out.println("Second maxValue : "+secondMaximumElement(arr));
        index= findIndexOfMinimumElement(arr);
        System.out.println("Min value index: "+index);
        System.out.println("Min Value : "+arr[index]);

    }
}
