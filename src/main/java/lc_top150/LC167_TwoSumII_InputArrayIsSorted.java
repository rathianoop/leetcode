package lc_top150;

import java.util.Arrays;

public class LC167_TwoSumII_InputArrayIsSorted {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9 )));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] returningArray = new int[2];
        int i = 0;
        int j = numbers.length-1;
        int sum = numbers[i] + numbers[j];

        while(i < j){


            if(sum < target){
                sum -= numbers[i];
                i++;
                sum+=numbers[i];
            }
            else if(sum > target){
                sum -= numbers[j];
                j--;
                sum += numbers[j];
            }
            else{
                returningArray[0] = i+1;
                returningArray[1] = j+1;
                return returningArray;
            }
        }

        return returningArray;
    }
}
