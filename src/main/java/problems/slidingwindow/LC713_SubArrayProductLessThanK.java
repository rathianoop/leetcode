package problems.slidingwindow;

public class LC713_SubArrayProductLessThanK {

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
        System.out.println(numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
        System.out.println(numSubarrayProductLessThanK(new int[]{1,1,1}, 1));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <=1){
            return 0;
        }

        int L = 0, R=0;
        int maxNumber = 0;
        int length = nums.length;
        int mul = 1;
        int number = 0;

        while(R < length){

            mul *= nums[R];


            while( mul >= k && L<length){
                mul = mul/nums[L];
                L++;
            }

            maxNumber += (R-L)+1;
            R++;
        }

        return maxNumber;

    }
}
