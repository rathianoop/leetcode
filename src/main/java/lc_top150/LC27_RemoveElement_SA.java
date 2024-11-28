package lc_top150;

public class LC27_RemoveElement_SA {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val){

        int startingIndex = 0;
        int matchingIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[startingIndex] = nums[i];
                startingIndex++;
            }else{
                matchingIndex++;
            }
        }
        return startingIndex;
    }
}
