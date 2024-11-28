package lc_top150;

public class LC55_JumpGame {

    public static void main(String[] args) {
       // System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int [] nums){

        for(int i = 0; i < nums.length; i++){
            System.out.println("here");
            i += nums[i];
            if(i == nums.length-1){
                return true;
            }
        }

        return false;
    }
}
