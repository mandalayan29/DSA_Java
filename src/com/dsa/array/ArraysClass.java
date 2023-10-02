package com.dsa.array;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {


    public static void main(String[] args) {

        Integer[] arrr= { 45,345,45,324,325,435,3,543,45,34,5,2};
        List<Integer> listt= Arrays.asList(arrr);
        System.out.println(listt);

        String a[] = new String[] { "A", "B", "C", "D" };
        List<String> list = Arrays.asList(a);
        System.out.println("The list is: " + list);

        int[] arr1= { 45,345,45,324,325,435,3,543,45,34,5,2 };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
//      Binary search: return position (index+1)
        System.out.println(Arrays.binarySearch(arr1, 45));

        int[] arr2= { 45,345,45,324,325,435,3,543,45,34,5,1 };
        System.out.println(Arrays.compare(arr1, arr1));

        int[] arr3= Arrays.copyOf(arr1, 5);
        System.out.println(Arrays.toString(arr3));
        int[] arr4= Arrays.copyOfRange(arr1, 1,5);
        System.out.println(Arrays.toString(arr4));

        Object[] arr5= new Object[] {1,2,3,4,5,6,67,7};
        System.out.println(Arrays.deepToString(arr5));


        System.out.println(Arrays.equals(arr1, arr2));

//        Arrays.fill(arr1, 8);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.hashCode(arr1));

        System.out.println(Arrays.mismatch(arr1, arr1));

    }
}
