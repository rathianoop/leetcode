package dsa.twopointers;

import java.util.Arrays;

public class LC26_RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
         int counter = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int counter = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else{
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

}
