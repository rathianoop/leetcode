package dsa.prefixsum;

public class LC724_FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums){

        int[] rightSum = new int[nums.length];
        int[] leftSum = new int[nums.length];


        rightSum[0] = nums[0];
        leftSum[nums.length-1] = nums[nums.length-1];
        int leftPointer = nums.length-2;
        for(int i = 1; i < nums.length; i++){
            rightSum[i] = nums[i] + rightSum[i-1];
            leftSum[leftPointer] = nums[leftPointer] + leftSum[leftPointer+1];
            leftPointer--;
        }

        for(int i = 0; i < nums.length; i++){
            if(rightSum[i] == leftSum[i])
                return i;
        }


        return -1;

    }
}
