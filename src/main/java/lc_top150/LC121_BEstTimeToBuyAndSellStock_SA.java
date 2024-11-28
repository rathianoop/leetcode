package lc_top150;

public class LC121_BEstTimeToBuyAndSellStock_SA {

    public static void main(String[] args) {
        System.out.println(bestTime(new int[]{7,1,5,3,6,4}));
        System.out.println(bestTime(new int[]{7,6,4,3,1}));
    }
/*
   int buy = Integer.MAX_VALUE;
       int maxProfit = 0;

       for(int i = 0; i < prices.length; i++){
        if(buy > prices[i]){
            buy = prices[i];
        }
        maxProfit = Math.max(maxProfit, prices[i]-buy);
       }


        return maxProfit;
 */
    public static int bestTime(int[] nums){
        int bestTime = 0;

        int buy = 0;
        int sell = nums.length-1;
        int diff = 0;
        while(buy < sell){
            if(nums[sell] - nums[buy] > diff){
                diff = nums[sell] - nums[buy];
                bestTime = sell+1;
            }
            if(nums[buy+1] < nums[buy]){
                buy ++;
            }else{
                sell--;
            }
        }

        return bestTime;
    }
}
