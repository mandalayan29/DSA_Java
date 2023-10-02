package com.dsa.recursion;

import java.util.Scanner;

public class Factorial {

    public int factorialRecursion(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursion(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number to calculate it's factorial : ");
        int n= scanner.nextInt();
        Factorial obj= new Factorial();
        System.out.println(n+"! = "+obj.factorialRecursion(n));
    }

}
