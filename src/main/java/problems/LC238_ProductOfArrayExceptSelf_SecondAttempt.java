package problems;

import java.util.Arrays;

public class LC238_ProductOfArrayExceptSelf_SecondAttempt {

    public static void main(String[] args) {
        System.out.println(String.valueOf(mul(new int[]{1,2,3,4})));
    }

    public static int[] mul(int[] nums){

        int len = nums.length;

        int[] returningArray = new int[len];

        returningArray[0]=1;

        for(int i = 1; i < len; i++){
            returningArray[i] = returningArray[i-1]*nums[i-1];
        }

        int suffix = 1;

        for(int i = len-1; i >=0; i--){
            returningArray[i] *=suffix;
            suffix *=nums[i];
        }

        return returningArray;


    }


}
