package com.example.practice1;

public class RemoveElement {
    static int removeElement(int[] nums,int val){
       int count=0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=val){
               //here 2 will be eleminating and printing remaining numbers
               nums[count]=nums[i];
               count++;
           }
       }
       return count;
    }

    public static void main(String args[]){
        int [] nums={0,1,2,2,3,0,4,2};
        int val=0;//measns here occurence should be removed and print remainig count
        System.out.println(removeElement(nums,val));
    }
}
