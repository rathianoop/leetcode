package problems.slidingwindow;

public class MaxSubarrayOfSizeK {

    public static void main(String[] args) {
    //    System.out.println(maxSubArrayValue(new int[]{100, 200, 300, 400, 500, 600,700,800}, 3));
    }

    /*public static int maxSubArrayValue(int[] nums, int k){
        int maxNum = 0;
        int sum = 0;
        int leftpointer = 0;
        int rightPointer = 0;

        while( rightPointer < nums.length){
            sum += nums[];





        }


        for(int i = 0; i<=nums.length-k; i++){
            if(rightPointer - leftpointer + 1== k){
                maxNum = sum;
                sum -= nums[leftpointer] ;
                sum += nums[i];

                leftpointer++;

            }else{
                sum += nums[i];
            }
            rightPointer++;
        }


    }*/
}
