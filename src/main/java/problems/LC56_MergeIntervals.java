package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC56_MergeIntervals {

    public static void main(String[] args) {

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        int[][] returningArray = new int[intervals.length][2];
        returningArray[0][0] = intervals[0][0];
        returningArray[0][1] = intervals[0][1];
        int returningArrayPointer = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=returningArray[i-1][1]) {
                returningArray[returningArrayPointer][1] = intervals[i][1];
            }else{
                returningArray[returningArrayPointer][0] = intervals[i][0];
                returningArray[returningArrayPointer][1] = intervals[i][1];
            }
            returningArrayPointer++;
        }

    List list = new ArrayList<>();
    Set set = new HashSet();
       // set.to

    return returningArray;

    }
}
