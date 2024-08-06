package problems.slidingwindow;

public class LC1004_MaxConsecutivesOnesIII {

    public static void main(String[] args) {

        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));

    }

    public static int longestOnes(int[] nums, int k) {

        int L=0, R=0;
        int flipCounter = 0;
        int max = 0;
        int length = nums.length;

        while(R < length){
            if(nums[R] == 0 && flipCounter <= k){
                flipCounter++;
                max++;
            }else if(nums[R] == 1){
                max++;
            }


            while(flipCounter >k && L < length){
                if(nums[L] == 0){
                    flipCounter--;
                    max--;
                }
                L++;
            }

            max = Math.max(max, R-L+1);
            R++;

        }
        return max;

    }
}
