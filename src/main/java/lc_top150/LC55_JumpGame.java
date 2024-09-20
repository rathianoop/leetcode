package lc_top150;

public class LC55_JumpGame {

    public static void main(String[] args) {
       // System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int [] nums){
        int lastIndex = nums.length-1;

        for(int i = 1; i < lastIndex; i++){
            if(nums[i] == lastIndex-i) {
                return true;
            }
        }

        return false;
    }
}
