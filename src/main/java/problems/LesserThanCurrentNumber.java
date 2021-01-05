package problems;

public class LesserThanCurrentNumber
{
  public static void main(String[] args)
  {
    for(int i : smallerNumbersThanCurrent(new int[]{8,1,2,2,3}))
    {
      System.out.println(i);
    }
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {

    int[] returningArray = new int[nums.length];
    for(int count = 0; count < nums.length; count++)
    {
      int numberToMatch = nums[count];
      int lesserNumbersCount = 0;

      for(int innerCount = 0; innerCount < nums.length; innerCount++)
      {
        if(innerCount == count)
          continue;
        else if(nums[innerCount] < nums[count])
        {
          lesserNumbersCount++;
        }
      }
      returningArray[count] = lesserNumbersCount;
    }
    return returningArray;
  }
}
