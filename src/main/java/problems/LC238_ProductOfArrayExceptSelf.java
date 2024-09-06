package problems;

import java.util.Arrays;

public class LC238_ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        Arrays.toString(getMultipleArray(new int[]{4,5,1,8,2}));
    }

    public static int[] getMultipleArray(int[] intArray){

        int[] returningArray = new int[intArray.length];
        int[] beginingArray = new int[intArray.length];
        int[] endingArray = new int[intArray.length];

        for(int i = 0; i < beginingArray.length; i++){
            if(i == 0){
                beginingArray[i] =1;
                continue;
            }
            beginingArray[i] = beginingArray[i-1]*intArray[i-1];
        }

        for(int i = endingArray.length-1; i >= 0; i--){
            if(i == endingArray.length-1){
                endingArray[i] = 1;
                continue;
            }
            endingArray[i] = endingArray[i+1]*intArray[i+1];
        }

        for(int i = 0; i < intArray.length; i++){
            returningArray[i] = beginingArray[i]*endingArray[i];
        }

        return returningArray;
    }

}
