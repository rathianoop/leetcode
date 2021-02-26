package problems;

import javafx.application.Application;
import javafx.stage.Stage;

public class AlmostPalindrome_680
{
  public static void main(String[] args)
  {
    /*String s1 = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxj";
    String s2 =  new StringBuilder("jxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga").reverse().toString();
    System.out.println(s2);*/


    System.out.println(isPalindrome("abc"));
  }

  private static boolean isPalindrome(String s)
  {
    char[] charArray = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();

    int startPointer = 0;
    int endPointer = charArray.length-1;
    boolean deletedOneChar = false;

    String leftSubString = "";
    String rightSubString = "";

    while(startPointer < endPointer)
    {
      if(charArray[startPointer] != charArray[endPointer])
      {
        return isValid(s, startPointer, endPointer-1) || isValid(s , startPointer+1, endPointer);
       }
      startPointer++;
      endPointer--;
    }

    return true;
  }

  private static boolean isValid(String s, int startingIndex, int endingIndex)
  {
    while(startingIndex < endingIndex)
    {
      if(s.charAt(startingIndex) != s.charAt(endingIndex))
        return false;
      startingIndex ++;
      endingIndex --;
    }
    return true;
  }


}
