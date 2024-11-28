package lc_top150;

import java.util.*;

public class LC15_3Sum_SA {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] array, int target){
        List<List<Integer>> returningList = new ArrayList();

        for(int i= 0; i < array.length-2; i++){
            Map<Integer, Integer> map = new HashMap();
            int left = i+1;
            int right = left+1;
            while(left < right && right < array.length) {

                if (array[left] + array[right] + array[i] == target) {
                    returningList.add(Arrays.asList(array[i], array[left], array[right]));
                }
                map.put(array[left], left);
                left++;
                right++;
            }


        }

        return returningList;
    }
}
