package lc_top150;

public class LC11_ContainerWithMostWater_SA {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }


    public static int maxArea(int[] nums){
        int maxArea = 0;
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            maxArea = Math.max(maxArea, Math.min(nums[right], nums[left])*(right-left));
            if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
