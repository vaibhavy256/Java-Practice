package com.examples.practice;

import java.util.Arrays;

import static com.examples.practice.BuyAndSell.maxProfit;

public class BuyAndSell {
    public  static int maxProfit(int[] prices){
        int buy_price=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            //if current price is less update a buy_price
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                //check a better profit
                int current_profit=prices[i]-buy_price;
                profit=Math.max(current_profit,profit);
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
