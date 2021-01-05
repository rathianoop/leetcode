package problems;

public class ValidPalindromeII_String_680
{
  public static void main(String[] args)
  {
    System.out.println(isValidPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
  }

  private static boolean isValidPalindrome(String s)
  {
    char[] charArray = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();

    int startPointer = 0;
    int endPointer = charArray.length-1;
    boolean deletedOneChar = false;

    while(startPointer < endPointer)
    {
          if(charArray[startPointer] != charArray[endPointer])
          {
            if(!deletedOneChar)
            {
              if(charArray[startPointer+1] == charArray[endPointer])
                startPointer++;
              else if(charArray[startPointer] == charArray[endPointer-1])
                endPointer--;
              else
                return false;
              deletedOneChar = true;

            }
            else
              return false;
          }
      startPointer++;
      endPointer--;
    }

    return true;
  }
}
