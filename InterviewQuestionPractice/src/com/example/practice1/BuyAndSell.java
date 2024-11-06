package com.example.practice1;

//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

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
