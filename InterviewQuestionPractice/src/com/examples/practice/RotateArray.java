package com.examples.practice;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
    public static  int[] rotate(int [] nums, int k){
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    }

    private static void reverse(int[] nums, int k, int i) {
         while(k<=i){
             int temp=nums[k];
             nums[k]=nums[i];
             nums[i]=temp;
             k++;
             i--;
         }
    }




}
