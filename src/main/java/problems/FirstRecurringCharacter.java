package problems;


import java.util.*;

public class FirstRecurringCharacter
{
  public static void main(String[] args)
  {
    System.out.println(getFirstRecurringChar(new int[]{2,5,1,2,3,5,1,2,4}));
  }

  private static int getFirstRecurringChar(int[] array)
  {

    if(array == null || array.length == 1)
      return 0;
    Set<Integer> numberSet = new HashSet<>();
    int counter = 0;
    while(counter < array.length)
    {
      if(numberSet.add(array[counter]))
        counter++;
      else
        return array[counter];
    }

    return 0;
  }
}
