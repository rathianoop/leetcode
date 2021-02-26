package problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_3
{
  public static void main(String[] args)
  {
    System.out.println(getLongestSubStringLength("jbpnbwwd"));
  }

  private static int getLongestSubStringLength(String s)
  {
    int maxLength = 0;
    int currentLength = 0;
    Set<Character> charSet = new HashSet();

    char[] charArray = s.toCharArray();
    for(int counter = 0; counter < charArray.length; counter++)
    {
       for(int innerCounter = counter; innerCounter < charArray.length; innerCounter++)
       {
         if(charSet.add(charArray[innerCounter]))
         {
           currentLength++;
         }
         else{
           if(maxLength < currentLength) maxLength = currentLength;
           currentLength = 0;
           charSet.clear();
           break;
         }

       }
    }
    return currentLength > maxLength ? currentLength : maxLength;
  }
}
