package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2824CountPairsLessThanTarget {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(countPairs(list, 2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i = 0; i < nums.size()-1; i++){
            for(int j = i+1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }


        return count;

    }


}
