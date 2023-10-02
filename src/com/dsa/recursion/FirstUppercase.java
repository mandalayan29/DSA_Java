package com.dsa.recursion;

public class FirstUppercase {

    public static char first(String str){
        if(str.charAt(0)<96){
            return str.charAt(0);
        }
        if(str.length()==1){
            return ' ';
        }
        return first(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(first("ayanM"));
    }
}
