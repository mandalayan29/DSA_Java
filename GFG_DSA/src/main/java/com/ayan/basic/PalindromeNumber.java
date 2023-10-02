package com.ayan.basic;

public class PalindromeNumber {


    public static boolean iterativePalindromeCheck(int n) {
        int t=n;
        int rev=0;
        while (t > 0) {
            rev=rev*10+ t%10;
            t/=10;
        }
        System.out.println(rev);
        return rev==n;
    }

    public static void main(String[] args) {
        int n1= 12343210;
        int n2= 1233210;

        System.out.println(iterativePalindromeCheck(n1));
        System.out.println(iterativePalindromeCheck(n2));
    }
}
