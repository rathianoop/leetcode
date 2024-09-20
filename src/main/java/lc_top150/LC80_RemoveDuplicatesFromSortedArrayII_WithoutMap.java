package lc_top150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC80_RemoveDuplicatesFromSortedArrayII_WithoutMap {

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums){

        if(nums.length == 0 || nums.length == 1) return nums.length;
        int currentNumCounter = 1;
        int skipCounter = 1;
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(currentNumCounter < 2 && nums[i] == nums[i-1]){
                currentNumCounter++;
                counter++;
                nums[skipCounter] = nums[i];
                skipCounter++;
            }else if(currentNumCounter >=2 && nums[i] == nums[i-1]){
                currentNumCounter++;
            }else if(nums[i] != nums[i-1]){
                currentNumCounter = 1;
                nums[skipCounter] = nums[i];
                skipCounter++;
                counter++;
            }

        }


        return counter;
    }
}
