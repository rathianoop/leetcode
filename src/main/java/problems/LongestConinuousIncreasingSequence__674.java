package problems;


//This is a classic example of Sliding window problem.
public class LongestConinuousIncreasingSequence__674
{
  public static void main(String[] args)
  {
    int[] nums = new int[]{1,3,5,4,2,3,4,5};
    //int[] nums = new int[]{1,3,5,4,7};
    System.out.println(findLengthOfLCIS(nums));
  }

  public static int findLengthOfLCIS(int[] nums)
  {

    int result = 0;
    int anchor = 0;

    for (int counter = 0; counter < nums.length; counter++)
    {
      if(counter > 0 && nums[counter-1] >= nums[counter]) anchor = counter;
        result = Math.max(result, counter - anchor +1);
    }
    return result;
  }
}
