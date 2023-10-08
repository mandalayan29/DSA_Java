package com.ayan.array;

import java.util.Arrays;
import java.util.Random;

public class Reverse {

    public static void main(String[] args) {
        int n= 10;
        int[] arr= new int[n];
        Random r= new Random();
        for(int i=0; i<n; i++) {
            arr[i]= r.nextInt(100);
        }
        System.out.println("Before reverse");
        System.out.println(Arrays.toString(arr));

        int left=0;
        int right= n-1;

        while(left<right) {
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }

        System.out.println("After reverse");
        System.out.println(Arrays.toString(arr));
    }
}
