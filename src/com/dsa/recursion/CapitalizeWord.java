package com.dsa.recursion;

import java.util.Locale;

public class CapitalizeWord {

    public static String capitalizeWord(String str){
        if(str.length()==1){
            return str.toUpperCase(Locale.ROOT);
        }
        if(str.charAt(str.length()-2) == ' '){
            str= str.substring(0, str.length()-1)+ Character.toString(str.charAt(str.length()-1)).toUpperCase(Locale.ROOT);
        }
        return capitalizeWord(str.substring(0, str.length()-1))+Character.toString(str.charAt(str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWord("i am ayan mandal"));
    }
}

//
//    public static String capitalizeWord(String str){
//        if(str.charAt(0)== ' '){
//            str= " "+String.valueOf(str.charAt(1)).toUpperCase(Locale.ROOT)+str.substring(2);
//        }
//        if(str.length()==1){
//            return str;
//        }
//        System.out.println(str);
//        return String.valueOf(str.charAt(0))+ capitalizeWord(str.substring(1));
//    }i Am Ayan Mandal