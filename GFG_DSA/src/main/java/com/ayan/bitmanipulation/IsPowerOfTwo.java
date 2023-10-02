package com.ayan.bitmanipulation;

public class IsPowerOfTwo {
//    Two check if a number is power of two or not

    public static boolean isPowerOfTwo(int n) {
        if((n & (n-1)) == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n= 16;
        if(isPowerOfTwo(n)){
            System.out.println(n+" : is a power of two");
        }
        else{
            System.out.println(n+" : is not a power of two");
        }
    }

}
