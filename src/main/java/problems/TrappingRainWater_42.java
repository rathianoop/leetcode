package problems;

public class TrappingRainWater_42
{
  public static void main(String[] args)
  {
    System.out.println(getMaxTrappedWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }

  private static int getMaxTrappedWater(int[] height)
  {

    int waterCount = 0;

    for(int counter = 0; counter < height.length; counter++)
    {
      int numberToCheck = height[counter];
      int leftHighest = 0;
      int rightHighest = 0;
      int leftIndex = 0;
      int rightIndex = height.length-1;

      while(leftIndex < counter || rightIndex > counter)
      {
          if(leftIndex < counter)
          {
            leftHighest = height[leftIndex] > leftHighest ? height[leftIndex] : leftHighest;
            leftIndex++;
          }
          if(rightIndex > counter)
          {
            rightHighest = rightHighest < height[rightIndex] ? height[rightIndex] : rightHighest;
            rightIndex--;
          }
      }

      int heightToUse = Math.min(leftHighest, rightHighest);
      waterCount+=heightToUse-numberToCheck > 0 ? heightToUse-numberToCheck : 0;
    }
    return waterCount;
  }
}
