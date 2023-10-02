package com.dsa.leetcode;

public class Problem35 {

    public int searchInsert(int[] nums, int target){
        int f=0, l= nums.length-1;
        int mid=0;
        if(nums.length==0 || nums[0]>target) return 0;

        if(nums[l]<target) return (l+1);


        while(f<=l){

            mid= (f+l)/2;
            System.out.println("s: "+ mid);
            if( nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                l= mid-1;
            }
            else if(nums[mid]<target){
                f= mid+1;
            }

            if( nums[mid]< target && nums[mid+1]>target ){
                return mid+1;
            }

            if( nums[mid]> target && nums[mid+1]<target ){
                return mid-1;
            }

        }
        return -1;
    }
}
