package com.examples.practice;

public class BuyAndSell2 {
    public  static int maxProfit(int[] prices){

        int profit=0;

        for(int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
               profit+=prices[i]-prices[i-1];
           }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] nums={5,2,6,1,4,7,3,6};
        System.out.println(maxProfit(nums));
    }
}
