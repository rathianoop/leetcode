package problems;

import java.util.ArrayList;
import java.util.List;

public class IsOneAway
{
  public static void main(String[] args)
  {
    System.out.println(isOneAway("abcde", "abcd")); // Should return true
    System.out.println(isOneAway("abde", "abcde"));  // should return true
    System.out.println(isOneAway("a", "a"));  // should return true
    System.out.println(isOneAway("abcdef", "abqdef"));  // should return true
    System.out.println(isOneAway("abcdef", "abccef")); // should return true
    System.out.println(isOneAway("abcdef", "abcde"));  // should return true
    System.out.println(isOneAway("aaa", "abc"));  // should return false
    System.out.println(isOneAway("abcde", "abc"));  // should return false
    System.out.println(isOneAway("abc", "abcde"));  // should return false
    System.out.println(isOneAway("abc", "bcc")); // should return false
  }

  private static boolean isOneAway(String s1, String s2)
  {
    boolean isOneAway = true;
    if(Math.abs(s1.length() - s2.length()) > 1)
      return false;
    int s1Length = 0, s2Length = 0;

    int diff = 0;
    while( s1Length < s1.length() && s2Length < s2.length())
    {

      char s1Char = s1.charAt(s1Length);
      char s2Char = s2.charAt(s2Length);
      if(s1Char != s2Char)
      {
        diff++;
        if(diff > 1)
          return false;
        if(s1.length() < s2.length())
        {
          s2Length++;
          continue;
        }
        else if(s2.length() < s1.length())
        {
          s1Length++;
          continue;
        }
        else
        {
          s1Length++;
          s2Length++;
          continue;
        }
      }
      s1Length++;
      s2Length++;
    }
    return isOneAway;
  }
}
