package com.dsa.leetcode;

import java.util.Arrays;

public class Problem26 {

    public int removeElement(int[] nums, int val) {

        int index=0;
        int f=0;
        int l= nums.length;
        int j=0;

        if(nums.length==0)
            return 0;

        while(f!=l){
            // System.out.println(f+" : "+l+" : "+j);
            if(nums[f]==val){
                if(nums[--l]!= val){
                    nums[f]= nums[l];
                    f++;
                    j++;
                }
                // l--;
            }
            else{
                f++;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(f+" : "+j);
        return j;


    }

}
