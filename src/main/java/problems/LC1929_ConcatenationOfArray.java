package problems;

public class LC1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] returningArray = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            returningArray[i] = nums[i];
            returningArray[i+nums.length] = nums[i];
        }
        return returningArray;
    }

    public static void main(String[] args) {
        LC1929_ConcatenationOfArray lc1929ConcatenationOfArray = new LC1929_ConcatenationOfArray();
        int[] array = new int[]{1,2,1};
        lc1929ConcatenationOfArray.getConcatenation(array);
    }
}
