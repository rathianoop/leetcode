package lc_top150;

import java.util.HashMap;

public class LC128_LongestConsecutiveSequence_SA {

    public static void main(String[] args) {
        System.out.println(getLongestSub(new int[]{100,4,200,1,3,2}));
    }

    public static int getLongestSub(int[] nums){

        int longest = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int length = 1;
            while(map.containsKey(num+1)){
                num = num+1;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;


    }
}
