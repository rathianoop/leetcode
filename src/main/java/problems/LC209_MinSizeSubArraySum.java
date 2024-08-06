package problems;

public class LC209_MinSizeSubArraySum {

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums){

        //Pointers
        int L = 0, R = 0;

        //Min + length
        int min = Integer.MAX_VALUE;
        int length = nums.length;
        int sum = 0;

        while(R < length){
            sum += nums[R];

            while(sum >= target){
                min = Math.min(min, R-L+1);
                sum -=nums[L];
                L++;
            }
            R++;
        }

        return min == Integer.MAX_VALUE ? 0: min ;

    }

}
