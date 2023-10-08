package com.ayan.array;

public class Search {

    public static void main(String[] args) {
        int[] arr= {1,2,7,4,5,6,7,8,9,10};
        int n= 7;

        for(int i=0; i< arr.length; i++) {
            if(arr[i]==n) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
