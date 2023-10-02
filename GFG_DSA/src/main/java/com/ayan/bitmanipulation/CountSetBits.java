package com.ayan.bitmanipulation;

public class CountSetBits {

    public static int countSetBit1(int n){
        int c=0;
        while(n>0){
            c= c+ (n&1);
            n= n>>1;
        }
        return c;
    }

    public static int countSetBit2(int n){
        int c=0;
        while(n>0){
            if( (n & 1) != 0 ) {
                c++;
            }
            n= n>>1;
        }
        return c;
    }

//    Brian and Kerningham Algorithm
    public static int countSetBit3(int n){
        int c=0;
        while(n!=0){
            n= n & (n-1);
            c++;
        }
        return c;
    }

    public static void countSetBit4(int[] n) {
        int[] lookupTable=  new int[256];
        lookupTable[0]=0;
        for(int i= 0; i< 256; i++) {
            lookupTable[i]= (i & 1) + lookupTable[i / 2];
        }

        for( int i: n) {
            System.out.print( lookupTable[i & 255] + lookupTable[i>>8 & 255] + lookupTable[i>>16 & 255] + lookupTable[i>>24]+ " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int n= 55;
        System.out.println(countSetBit1(n));
        System.out.println(countSetBit2(n));
        System.out.println(countSetBit3(n));

        countSetBit4(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 13});
    }

}
