package dsa.twopointers;

public class LC27_RemoveElement {

    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3,2,2,3}, 3));

    }

    public static int removeElement(int[] nums, int val) {

        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == val ){

            }
        }

        return counter;
    }
}
