package com.dsa.array;

import java.util.Arrays;

public class MiddleElement {

    public static int[] middle(int[] arr) {
         int length= arr.length;
         if(arr.length%2==1){
             return new int[]{arr[length/2]};
         }
         else{
             return new int[]{arr[length/2-1], arr[length/2]};
         }
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(middle(array)));
    }
}
