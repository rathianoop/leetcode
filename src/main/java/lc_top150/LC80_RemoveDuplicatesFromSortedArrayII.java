package lc_top150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC80_RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums){

        if(nums.length == 0 || nums.length == 1) return nums.length;
        Map<Integer, Integer> counterMap = new HashMap();
        counterMap.put(nums[0], 1);
        int skipCounter = 1;
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(counterMap.get(nums[i]) == null || counterMap.get(nums[i]) < 2){
                counterMap.put(nums[i], counterMap.getOrDefault(nums[i], 0) + 1);
                counter++;
                nums[skipCounter] = nums[i];
                skipCounter++;
            }

        }


        return counter;
    }
}
