package com.dsa.array;

public class MissingNumber {

    public void missingNumber(int[] intArray) {
        int i=1;
        for(int j=0; i<intArray.length; j++){
            if(intArray[j]!=i){
                System.out.println(i);
                break;
//                j--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 8, 9, 10};
        MissingNumber obj= new MissingNumber();
        obj.missingNumber(arr);
    }
}
