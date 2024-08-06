package problems.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LC219_ComtainsDuplicateII {

    public static void main(String[] args) {
        //System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int L=0, R=0;
        int len = nums.length;
        int diff = 0;
        boolean hasDuplicate = false;
        Set<Integer> set = new HashSet();
        while( R < len){
            if( R-L <=k){
                if(set.contains(nums[R])){
                    if(nums[L] == nums[R]){
                        return true;
                    }
                }{
                    set.add(nums[R]);
                }
            }else{
                L++;
            }
            R++;
        }

        return hasDuplicate;
    }
}
