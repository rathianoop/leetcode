package problems;

public class MaximumSubArray
{
  public static void main(String[] args)
  {
    Integer[] nums = new Integer[]{-2,1,-3,4,-1,2,1,-5,4};
    int biggestNumber = 0;
    int position = 0;
    for(int counter = 0; counter< nums.length; counter++)
    {
      if(nums[counter] > biggestNumber)
      {
        biggestNumber = nums[counter];
        position = counter;
      }
    }
    int sum = 0;
    do
    {
      sum +=nums[position];
      position++;
    }while(sum > 0);

    System.out.println(sum);
  }
}
