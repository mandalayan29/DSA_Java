package com.ayan.array;

import java.util.Arrays;

public class MoveZeroTowardsEnd {

    public static void moveZero(int[] arr) {
        int len=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                arr[len]= arr[i];
                if(i!=len) arr[i]=0;
                len++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr= {0,0,10,0,9,0};
        int[] arr= {10,15,0,20,0,25};
        System.out.println(Arrays.toString(arr));
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }


}
