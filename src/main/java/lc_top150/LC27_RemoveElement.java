package lc_top150;

import java.util.Arrays;

public class LC27_RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val){
        int startingCounter = 0;
        int nextCounter = 0;
        int matchingNum = 0;

        while(nextCounter < nums.length -1){
            if(nums[startingCounter] == val){
                matchingNum++;
                if(nums[nextCounter] != val){
                    nums[startingCounter] = nums[nextCounter];
                }
            }else{
                startingCounter++;
            }
            nextCounter++;
        }

        return matchingNum;
    }
}
