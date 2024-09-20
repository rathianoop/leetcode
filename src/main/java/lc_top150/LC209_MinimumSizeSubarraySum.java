package lc_top150;

public class LC209_MinimumSizeSubarraySum {

    public static void main(String[] args) {
       // System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int L = 0, R = 0;
        int sum = 0;
        int subArrayLen = Integer.MAX_VALUE;

        while(R < nums.length){
            sum += nums[R];
            if(sum>=target){
                subArrayLen = Math.min(subArrayLen, R-L+1);
                sum -=nums[L];
                L++;
            }
            R++;

        }

        return subArrayLen == Integer.MAX_VALUE ? 0 : subArrayLen;

    }
}
