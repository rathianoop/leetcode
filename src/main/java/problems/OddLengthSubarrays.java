package problems;

public class OddLengthSubarrays
{
  public static void main(String[] args)
  {

  }

  private static int getCount(int[] array)
  {
    int totalCount = 0;
    for(int count = 0; count < array.length; count++)
    {
      int updatedCount = 0;
      totalCount += array[count];
      updatedCount +=2;
      while(updatedCount < array.length)
      {
        for(int number : array)
        {
          totalCount += array[count] + array[count + 1] + array[count + 2];
        }
      }
      if((count + 2) < array.length )
      {
        totalCount += array[count]+array[count+1]+array[count+2];
      }
     // if()
    }

    return totalCount;
  }
}
