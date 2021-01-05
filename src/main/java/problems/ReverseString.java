package problems;

public class ReverseString
{
  public static void main(String[] args)
  {
    System.out.println(reverseString("Great Life!!"));

  }

  private static String reverseString(String stringToReverse)
  {
    stringToReverse.hashCode();
    if(stringToReverse == null || stringToReverse.length() == 0)
    {
      return stringToReverse;
    }
    StringBuilder reverseString = new StringBuilder();
    char[] charsToReverse = stringToReverse.toCharArray();

    for(int counter = charsToReverse.length-1; counter >= 0; counter--)
    {
      reverseString.append(charsToReverse[counter]);
    }
    return  reverseString.toString();
  }

}
