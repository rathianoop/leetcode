package problems;

import java.util.Arrays;

public class MergeSortedArrays
{
  public static void main(String[] args)
  {
    int[] array1 = new int[]{0, 3, 4, 31};
    int[] array2 = new int[]{4, 6, 30};
    System.out.println(Arrays.asList(mergeSortedArray(array1, array2)));
  }

  private static int[] mergeSortedArray(int[] array1, int[] array2)
  {
    int[] mergedArray = new int[array1.length + array2.length];
    int counter_1 = 0;
    int counter_2 = 0;
    int counter = 0;

    while (counter_1 < array1.length && counter_2 < array2.length)
    {
      if (array1[counter_1] <= array2[counter_2])
      {
        mergedArray[counter] = array1[counter_1];
        counter_1++;
      }
      else if (array2[counter_2] <= array1[counter_1])
      {
        mergedArray[counter] = array2[counter_2];
        counter_2++;
      }
      counter++;
    }

    while (counter_1 < array1.length)
    {
      mergedArray[counter] = array1[counter_1];
      counter_1++;
      counter++;
    }
    while (counter_2 < array2.length)
    {
      mergedArray[counter] = array2[counter_2];
      counter_2++;
      counter++;
    }

    return mergedArray;

  }
}
