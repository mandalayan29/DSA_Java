package com.ayan.array;

public class ArrayFrequency {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10, 10};
        int len= arr.length;
        int c=1;
        for(int i=0; i<len; i++) {
            if(i== len-1) {
                System.out.println(arr[i]+" : "+c);
                break;
            }
            if(arr[i]== arr[i+1]) {
                c++;
            }
            else {
                System.out.println(arr[i]+" : "+c);
                c=1;
            }
        }

    }
}
