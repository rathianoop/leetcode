package DataStructures.Arrays;

public class RemoveElement_UnsortedWithNumber
{
  public static void main(String[] args)
  {
    System.out.println(getLength());
  }

  private static int getLength()
  {
    int startingInt = 0;
    int[] nums = new int []{3,2,2,3};
    int val = 3;

    for(int counter = 0; counter < nums.length; counter++)
    {
      if(nums[counter] != val)
      {
        nums[startingInt] = nums[counter];
        startingInt++;
      }
    }
    return startingInt;
  }
}
