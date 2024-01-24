package com.ayan.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayLeader {

    public static void getLeaders(int[] arr) {

        int max=0;
        int len= arr.length;
        while(len>0){
            if(max<arr[len-1]) {
                max= arr[len-1];
                System.out.println(arr[len-1]);
            }
            len--;
        }

    }

    public static void main(String[] args) {
        int[] arr= new int[10];
        int t=0;
        Random r= new Random();
        while(t++<10-1) {
            arr[t]= r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        getLeaders(arr);
    }
}
