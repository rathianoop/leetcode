package problems;

import java.util.*;

public class LongestSubstring_3_SlidingWindow
{
  public static void main(String[] args)
  {
    System.out.println("cdd 2 "+getMaxLength("cdd"));//2
    System.out.println("aab : 2 "+getMaxLength("aab"));//2
    System.out.println("jbpnbwwd : 4 "+getMaxLength("jbpnbwwd"));//4
    System.out.println("pwwkew : 3 "+getMaxLength("pwwkew"));//3
    System.out.println("abcabcbb 3 "+getMaxLength("abcabcbb"));
    System.out.println("tmmzuxt 5 "+getMaxLength("tmmzuxt"));
  }
  private static int getMaxLength(String s)
  {
    int maxLength = 0;
    int currentLength = 0;
    HashMap<Character, Integer> charMap = new HashMap();
    int left = 0;

    for(int right = 0; right < s.length(); right ++)
    {
      char charAtRight = s.charAt(right);
      if(charMap.getOrDefault(charAtRight, -1) >= left)
      {
        left =charMap.getOrDefault(charAtRight, 0) + 1;
      }
      charMap.put(charAtRight, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}

