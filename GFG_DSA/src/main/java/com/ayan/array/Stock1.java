package com.ayan.array;

public class Stock1 {



    public static void main(String[] args) {
//        int arr[] = {1, 5, 3, 8, 12};
        int[] arr= {100, 180, 260, 310, 40, 535, 695};
        int len= arr.length;

        int bd=0, sd;
        int min= arr[0];
        int max= arr[0];
        System.out.println("Buy at : "+ arr[0]);
        bd= arr[0];
        int s=0;
        for (int i=1; i< len; i++) {
            if(arr[i]>max) {
                max= arr[i];
            }
            else {
                System.out.println("Buy at : "+arr[i]);
                bd= arr[i];
            }
            if( (i+1)<len && arr[i]> arr[i+1] ) {
                System.out.println("Sell at : " + arr[i]);
                s= s+ (arr[i]-bd);
            }
            else if(i== len-1) {
                System.out.println("Sell at : " + arr[i]);
                s= s+ (arr[i]-bd);
            }
        }
        System.out.println("Total : "+s);
    }
}
