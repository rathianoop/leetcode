package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LC1389_CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        targetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
    }

    public static int[] targetArray (int[] nums, int[] index){
        int[] returningArray = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length-1; j++){
                returningArray[j+1] = returningArray[j];
                returningArray[j] = nums[i];
            }
        }
        return returningArray;
    }

}
