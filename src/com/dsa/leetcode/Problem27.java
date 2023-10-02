package com.dsa.leetcode;

public class Problem27 {
    public int removeDuplicates(int[] nums) {

        int index=0;
        for(int i=1; i<nums.length; i++){
            if(nums[index]!= nums[i]){
                nums[++index]= nums[i];
            }
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(index+1);
        return index+1;
    }
}

