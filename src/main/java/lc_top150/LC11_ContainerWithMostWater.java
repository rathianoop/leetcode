package lc_top150;

public class LC11_ContainerWithMostWater {


    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7} ));
        System.out.println(maxArea(new int[]{1,3,2,5,25,24,5} ));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;

        maxArea = Math.min(height[i], height[j]) * (j-i);

        while(i < j){
            if(height[i] < height[j]){
                i++;
            }
            else if(height[j] < height[i] ){
                j--;
            }else{
                j--;
            }

            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));


        }

        return maxArea;
    }
}
