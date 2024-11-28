package lc_top150;

import java.util.Arrays;

public class LC189_RotateArray {

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7};
        rotateArray(input, 3);
        System.out.println(Arrays.toString(input));
        input = new int[]{1,2};
        rotateArray(input, 3);
        System.out.println(Arrays.toString(input));
    }

    public static void rotateArray(int[] nums, int k){
         k %= nums.length;

         reverse(nums, 0, nums.length-1);
         reverse(nums, 0, k-1);
         reverse(nums, k, nums.length-1);


    }

    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
