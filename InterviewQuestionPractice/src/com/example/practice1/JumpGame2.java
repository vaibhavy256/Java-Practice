package com.example.practice1;

public class JumpGame2 {
    public static int jump(int[] nums) {
    int totalJumps=0;
    int destination= nums.length-1;
    int lastIndex=0,coverage=0;

    for(int i=0;i<nums.length;i++){
        coverage=Math.max(coverage,i+nums[i]);
        if(i==lastIndex){
            lastIndex=coverage;
            totalJumps++;
            if(coverage>=destination){
                return totalJumps;
            }
        }
    }
    return totalJumps;
    }
    public static void main(String[] args){
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
