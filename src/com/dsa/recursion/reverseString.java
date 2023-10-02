package com.dsa.recursion;

public class reverseString {

    public static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        return str.substring(str.length()-1).concat(reverse(str.substring(0, str.length()-1)));
    }

    public static String reverse2(String str){
        if(str.length()==1){
            return str;
        }
//        return reverse2(str.substring(1,str.length()))+str.charAt(0);
        return reverse2(str.substring(1)+str.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(reverse2("Ayan"));
    }
}
