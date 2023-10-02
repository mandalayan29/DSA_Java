package com.ayan.bitmanipulation;

import java.util.Arrays;

public class TwoOddOccurring {

    public static int[] getTwoOddOccurring(int[] arr) {
        int xor=0;
        for(int i: arr) {
            xor= xor ^ i;
        }
        
    }

    public static void main(String[] args) {
        int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        System.out.println(Arrays.toString(getTwoOddOccurring(arr)));
    }
}
