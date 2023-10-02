package com.dsa.array;

import java.util.Arrays;
//Need to fix


public class RotateMatrix {

    public static void printMAtrix(int[][] matrix){
        System.out.println("-".repeat(20));
        for(int[] row: matrix){
            for(int item: row){
                System.out.print(item+" ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(20));
    }

//    public static int[][] rotateArray(int[][] matrix){
//        int[][] mat= new int[3][3];
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                mat[i][j]= matrix[2-j][i];
//            }
//        }
//        return mat;
//    }

    public static boolean rotateArray(int[][] matrix){
        if(matrix.length== 0 || matrix.length!= matrix[0].length) return false;
        int rows= matrix.length;
        for(int layer=0; layer<rows/2; layer++){
            int first= layer;
            int last= rows-1-layer;
            for(int i= first; i< last; i++){
                int offset= i-first;
                int top= matrix[first][i];
                matrix[first][i]= matrix[last-offset][i];
                matrix[last-offset][offset]= matrix[last- offset][first];
                matrix[last-offset][first]= matrix[last][last-offset];
                matrix[last][last-offset]= matrix[i][last];
                matrix[i][last]= top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
         printMAtrix(matrix);
        System.out.println(rotateArray(matrix));
        printMAtrix(matrix);
//        System.out.println(Arrays.deepToString(matrix));
//        printMAtrix(matrix);
//        printMAtrix(rotateArray(matrix));
    }
}
