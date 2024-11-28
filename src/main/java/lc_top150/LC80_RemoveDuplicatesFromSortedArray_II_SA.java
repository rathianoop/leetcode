package lc_top150;

import java.util.HashMap;
import java.util.Map;

public class LC80_RemoveDuplicatesFromSortedArray_II_SA {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
/*
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

 */
    public static int removeDuplicates(int[] nums){

        int counter = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(nums[0], 1);

        for(int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if (map.get(nums[i]) < 2) {
                    counter++;
                    map.put(nums[i], map.get(nums[i]) + 1);
                    nums[counter] = nums[i];
                }
            }else{
                map.put(nums[i], 1);
                counter++;
            }
        }

        return counter+1;
    }
}
