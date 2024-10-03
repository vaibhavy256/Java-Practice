package com.example.practice1;

public class JumpGame2 {
    public static int jump(int[] nums){
        int totalJumps=0;

        int destination=nums.length-1;

        int coverage=0,lastindex=0;

        if(nums.length==1) return 0;

        for(int i =0;i<nums.length;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastindex){
                lastindex=coverage;
                totalJumps++;
                if(coverage>=destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
    public static void main(String[] args){
        int[] nums={5,2,6,1,4,7,3,6};
        System.out.println(jump(nums));
    }
}
