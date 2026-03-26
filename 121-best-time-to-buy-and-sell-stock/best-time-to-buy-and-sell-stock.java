import java.io.*;
class Solution {
    public int maxProfit(int[] prices) {
      int buy=prices[0];
      int sell=0;
      for(int i=0;i<prices.length;i++){
        if(prices[i]<buy){
            buy=prices[i];
        }
        int profit=prices[i]-buy;
        if(profit>sell){
            sell=profit;
        }
      }
      return sell;
    }
}