package dsa.prefixsum;

public class LC1413_MinValueToGetPositiveStepByStepSum {

    public static void main(String[] args) {
        //System.out.println(minNum(new int[]{-3,2,-3,4,2}));
        //System.out.println(minNum(new int[]{1,2}));
        System.out.println(minNum(new int[]{2,3,5,-5,-1}));
    }

    private static int minNum(int[] nums){


        int minValue = 0;
        int prefixSum = 0;
        for(int num : nums){
            prefixSum +=num;
            minValue = Math.min(prefixSum, minValue);
        }
        System.out.println(minValue);
        System.out.println(1-minValue);


        int minSum = 0;
        int prefixSum1 = 0;

        for(int num : nums){
            prefixSum1 +=num;
            minSum = Math.min(prefixSum1, minSum);
        }
        System.out.println(1-minSum);
        return 1-minSum;

    }

}
