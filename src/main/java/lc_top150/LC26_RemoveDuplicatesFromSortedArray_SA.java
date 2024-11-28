package lc_top150;

import java.util.HashSet;
import java.util.Set;

public class LC26_RemoveDuplicatesFromSortedArray_SA {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
/*
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
 */
    public static int removeDuplicates(int[] nums){

        Set<Integer> seen = new HashSet();
        int startingCounter = 0;
        seen.add(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(seen.add(nums[i])){
                startingCounter++;
                nums[startingCounter] = nums[i];
            }
        }


        return seen.size();
    }
}
