package problems;

public class ShuffleString
{
  public static void main(String[] args)
  {
    System.out.println(reformatString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
  }

  private static String reformatString(String stringToFormat, int[] indices)
  {
    char[] toReturnChars = new char[stringToFormat.length()];
    for(int i = 0; i < stringToFormat.length(); i++)
    {
      toReturnChars[indices[i]] = stringToFormat.charAt(i);
    }
    return String.valueOf(toReturnChars);
  }
}
