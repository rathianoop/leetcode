package problems;

import java.util.Arrays;

public class LC2574_LeftAndRightSumDiff {

    public static void main(String[] args) {
        int[] array = new int[]{10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(array)));
    }

    public static int[] leftRightDifference(int[] nums) {

        int[] returningArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            int leftCheck = i-1;
            int rightCheck = i+1;
            int value = 0;
            while(leftCheck>-1){
                leftSum +=nums[leftCheck];
                leftCheck--;
            }
            while(rightCheck<nums.length){
                rightSum +=nums[rightCheck];
                rightCheck++;
            }
            returningArray[i] = Math.abs(leftSum - rightSum);

        }
        return returningArray;

    }


}
