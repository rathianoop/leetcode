package problems;

public class ShuffleArrays
{
  public static void main(String[] args)
  {
    int[] nums = new int[]{2,5,1,3,4,7};
    int number = 3;
    int[] returningArray = getShuffledArray(nums, number);
    for(int returningNumner : returningArray)
    {
      System.out.println(returningNumner);
    }
  }

  private static int[] getShuffledArray(int[] nums, int n)
  {
    int[] returningArray = new int[nums.length];

    for(int numsCount =0, returningCount = 0; numsCount <  nums.length/2; numsCount++)
    {
      returningArray[returningCount] = nums[numsCount];
      returningArray[returningCount+1] = nums[numsCount+n];
      returningCount+=2;
    }
    return returningArray;
  }
}
