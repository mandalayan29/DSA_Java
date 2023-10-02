package com.dsa.array;

public class BestScore {

    static String firstSecond(int[] myArray) {
        int m1=0, m2=0;
        for(int i=0; i<myArray.length; i++){
            if(m1<myArray[i]){
                m2= m1;
                m1= myArray[i];
            }
            else if(m2<myArray[i] && m1!=myArray[i]){
                m2= myArray[i];
            }
        }
        return m1+" "+m2;
    }

    public static void main(String[] args) {

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2, 90,0};
        System.out.println(firstSecond(myArray));
    }

}
