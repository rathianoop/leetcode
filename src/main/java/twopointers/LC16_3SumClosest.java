package twopointers;

public class LC16_3SumClosest {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target){
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-2; i++){
            int num = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(num + nums[left]+nums[right] == target){
                    left++;
                    continue;
                }else{
                    minDifference = Math.min(minDifference, target-(num + nums[left]+nums[right]));
                    right--;
                }
            }
        }
        return minDifference;
    }
}
