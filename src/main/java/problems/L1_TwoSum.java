package problems;

import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] returningArray = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if(map.getOrDefault(diff, -1) > -1){
                returningArray[0] = map.get(diff);
                returningArray[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return returningArray;
    }

    public static void main(String[] args) {
        L1_TwoSum l1TwoSum = new L1_TwoSum();
        int[] array = new int[]{2,7,11,15};
        l1TwoSum.twoSum(array, 9);
    }


}
