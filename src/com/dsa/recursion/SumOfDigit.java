package com.dsa.recursion;

public class SumOfDigit {

    public static int sumOfDigit(int num){
        if(num<10){
            return num;
        }
        return num%10+sumOfDigit(num/10);
    }

    public static void main(String[] args) {
        int num= 21932;
        System.out.println(sumOfDigit(num));
    }
}
