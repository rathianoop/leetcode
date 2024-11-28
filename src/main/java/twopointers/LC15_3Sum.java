package twopointers;

import java.util.*;

public class LC15_3Sum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> returningList = new ArrayList();
        Map<Integer, Integer> count = new HashMap();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            Integer num = Integer.valueOf(nums[i]);
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                if (num + nums[left] + nums[right] == 0) {
                    returningList.add(Arrays.asList(new Integer[]{num, (Integer) nums[left], (Integer) nums[right]}));
                    left +=1;
                    right -=1;
                }
                else{
                    left++;
                }
            }
        }
        return returningList;
    }
}
