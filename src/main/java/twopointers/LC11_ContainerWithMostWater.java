package twopointers;

public class LC11_ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){

            maxArea = Math.max(maxArea, Math.min(height[right], height[left])*(right-left));

            if(height[left] > height[right] ){
                right--;
            }
            else{
                left++;
            }
        }

        return maxArea;
    }
}
