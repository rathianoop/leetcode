package dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class LC560_SumarraySumEqualsK {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3}, 3));
      //  System.out.println(subarraySum(new int[]{-1,-1,1}, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 1);
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            int diff = sum - k;
            if (cache.containsKey(diff)) {
                count += cache.get(diff);
            }
            cache.put(sum, cache.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}


