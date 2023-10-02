package com.dsa.recursion;

public class PalindromeString {

    public static boolean isPalindrome(String s){
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        if(s.length()==1 || s.length()==0){
            return true;
        }
        return isPalindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        String str1= "aaahaaa";
        String str2= "ayan mandalk";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}
