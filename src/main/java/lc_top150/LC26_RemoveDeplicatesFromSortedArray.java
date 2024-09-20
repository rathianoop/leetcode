package lc_top150;

import java.util.HashSet;
import java.util.Set;

public class LC26_RemoveDeplicatesFromSortedArray {

    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums){

        if(nums.length == 0 || nums.length == 1) return nums.length;

        int uniqueCounter = 1;
        int skipCounter = 1;
        Set<Integer> seen = new HashSet();
        seen.add(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(seen.contains(nums[i])){
                continue;
            }else{
                seen.add(nums[i]);
                nums[skipCounter] = nums[i];
                skipCounter++;
                uniqueCounter++;
            }
        }

        return uniqueCounter;
    }
}
