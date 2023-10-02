package com.ayan.bitmanipulation;

public class OneOddOccuring {

    public static int oneOddOccuring(int[] arr) {
        int x=arr[0];
        for(int i=1; i< arr.length; i++) {
            x=x^ arr[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,3,2,1,3,3,1};
        System.out.println(oneOddOccuring(arr));
    }
}
