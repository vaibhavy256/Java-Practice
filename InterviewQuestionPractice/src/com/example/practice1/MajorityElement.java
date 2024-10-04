package com.example.practice1;

public class MajorityElement {
    public static int MajorityElement(int[] nums){
        int count=0;
        int candidate=0;
         for(int n:nums){
             //The current candidate has no "votes" left, or all previously accumulated votes have been canceled out by other elements.
             //Since the votes for the current candidate have neutralized, it's time to choose a new candidate
             if(count==0){
                 candidate=n;
             }
             count=count+((n==candidate)?1:-1);
         }
         return candidate;
    }
    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2,3};
        System.out.println(MajorityElement(nums));
    }

}
