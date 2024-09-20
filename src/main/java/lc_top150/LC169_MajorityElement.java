package lc_top150;

import java.util.HashMap;
import java.util.Map;

public class LC169_MajorityElement {

    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
           if(entry.getValue() > nums.length/2)
               return entry.getKey();
        }

        return 0;
    }
}
