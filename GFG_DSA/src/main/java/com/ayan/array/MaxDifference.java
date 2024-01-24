package com.ayan.array;

public class MaxDifference {

    public static void getDiff(int[] arr) {
        int len= arr.length;
        int res= arr[1]- arr[0];
        int minval= arr[0];
        for(int i=1; i<len; i++) {
            res= Math.max(res, arr[i] - minval);
            minval= Math.min(arr[i], minval);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr= {2, 3, 10, 6, 4, 8, 1};
        getDiff(arr);
    }

}
