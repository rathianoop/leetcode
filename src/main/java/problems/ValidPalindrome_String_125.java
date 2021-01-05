package problems;

public class ValidPalindrome_String_125
{
  public static void main(String[] args)
  {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isValidPalindrome(s));

    String s2 = "race a car";
    System.out.println(isValidPalindrome(s2));
  }

  private static boolean isValidPalindrome(String s)
  {
    System.out.println(s);
    s.replaceAll("[^a-zA-Z]", "");
    char[] charArray = s.toLowerCase().replaceAll("[^A-Za-z]", "").toCharArray();

    int startCounter = 0;
    int endCounter = charArray.length-1;

    while(startCounter < endCounter)
    {
      System.out.println(charArray[startCounter]);
      System.out.println(charArray[endCounter]);
      if(charArray[startCounter++] != charArray[endCounter--])
      {
        return false;
      }
    }
    return true;
  }
}
