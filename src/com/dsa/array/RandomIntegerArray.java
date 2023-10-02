package com.dsa.array;

import java.util.Random;

public class RandomIntegerArray {

    int n=5;

    public RandomIntegerArray(int n){
        this.n= n;
    }

    public int[] getArray(){
        Random random= new Random();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= random.nextInt(100);
        }
        return arr;
    }
}
