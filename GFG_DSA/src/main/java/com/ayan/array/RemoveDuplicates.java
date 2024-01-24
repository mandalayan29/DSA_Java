package com.ayan.array;

import java.util.Arrays;

//Remove duplicated from a sorted array
public class RemoveDuplicates {

    public static int removeDuplicates1(int[] arr) {

        int len= 1;

        for(int i=1; i< arr.length; i++) {
            if(arr[len-1]!=arr[i]) {
                arr[len]=arr[i];
                len++;
            }
//            else
//                len++;
        }
        System.out.println(len);
        System.out.println(Arrays.toString(arr));
        return len;
    }

    public static int[] removeDuplicates2(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int arr[]= {10, 20, 20, 30, 30, 30, 30, 35, 40, 40};
        System.out.println(Arrays.toString(arr));
        removeDuplicates1(arr);
        System.out.println(Arrays.toString(arr));
    }

}
