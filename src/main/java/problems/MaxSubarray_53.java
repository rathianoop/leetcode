package problems;

public class MaxSubarray_53
{
  public static void main(String[] args)
  {
    System.out.println(getMaxSum_O_n(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
  }

  private static int getMaxSum_O_n(int[] array)
  {
    int maxSum = array[0];
    int currentSum = maxSum;

    for(int counter = 1; counter < array.length; counter++)
    {
      currentSum = Math.max(currentSum + array[counter], array[counter]);
      maxSum = Math.max(currentSum, maxSum);
    }
    return maxSum;
  }

  private static int getMaxSum_DivideAndConquer(int[] array)
  {
    int maxSum = 0;


    return maxSum;
  }
}
