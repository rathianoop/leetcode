package problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
  public static void main(String[] args)
  {
    //System.out.println(majorityElement(new int[]{3,2,3}));
    System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
  }

  public static int majorityElement(int[] nums) {
    int majorityElement = 0;
    Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

    for(int counter = 0; counter< nums.length; counter++)
    {
      int countForNum = 0;
      if(counterMap.containsKey(nums[counter]))
        countForNum =  counterMap.get(nums[counter]);

      if(countForNum == 0)
        counterMap.put(nums[counter], 1);
      else{
        countForNum+=1;
        counterMap.put(nums[counter], countForNum);
        if(countForNum > nums.length/2)
        {
          majorityElement = nums[counter];
          break;
        }
      }

    }


    return majorityElement;
  }
}
