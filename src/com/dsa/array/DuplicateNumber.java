package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static Object[] removeDuplicates(int[] arr){
        List<Integer> list= new ArrayList<>();
        list.add(arr[0]);
        int l= arr[0];
        for(int i=1; i<arr.length; i++){
            if(l!= arr[i]){
                l= arr[i];
                list.add(l);
            }
        }
        return list.toArray();
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

//    Output : [1, 2, 3, 4, 5]
}
