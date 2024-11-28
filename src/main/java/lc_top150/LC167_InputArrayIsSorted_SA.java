package lc_top150;

import java.util.Arrays;

public class LC167_InputArrayIsSorted_SA {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0}, -1)));
    }

    public static int[] twoSum(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[right] + nums[left] < target){
                left++;
            }else{
                return new int[]{left+1, right+1};
            }
        }

        return new int[0];

    }

}
