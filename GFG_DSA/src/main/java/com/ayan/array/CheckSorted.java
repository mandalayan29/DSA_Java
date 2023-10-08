package com.ayan.array;

public class CheckSorted {

    public static boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if( arr[i] > arr[i+1] ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1= new int[] {1,2,3,4,5,6,7,8};
        int[] arr2= new int[] {1,2,3,4,9,6,7,8};
        int[] arr3= new int[] {4,2,3,4,5,6,7,8};

        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));
    }
}
