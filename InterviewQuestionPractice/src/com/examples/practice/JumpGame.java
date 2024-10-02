package com.examples.practice;

public class JumpGame {
    public static boolean canJump(int[] nums){
       //   Inittially the final position is the last index
        int finalPosition=nums.length-1;

        //Start with second last index
        for(int i=nums.length-2;i>=0;i--){
            //If you can reach final position from this index
            //update the final position flag
            if(i+nums[i]>=finalPosition){
                finalPosition=i;
            }
        }
        //If we reach final position that we can assume jump ossible
        return finalPosition==0;
    }

    public static void main(String[] args){
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
