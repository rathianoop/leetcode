package problems;

import java.util.Arrays;

public class LC1929_ConcatenationOfArray_2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatenatedArray(new int[]{1,2,1})));

    }

    public static int[] concatenatedArray(int[] nums){
        int[] ans = new int[nums.length*2];

        for(int i =0; i < nums.length; i++){
            ans[i] = nums[i];
            System.out.println(nums.length);
            ans[i+(nums.length)] = nums[i];
        }
        return ans;
    }
}
