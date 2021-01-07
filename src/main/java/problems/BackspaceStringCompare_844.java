package problems;

public class BackspaceStringCompare_844
{
  public static void main(String[] args)
  {
    System.out.println(backspaceCompare("gtc#uz#", "gtcm##uz#"));
  }

  private static boolean backspaceCompare(String S, String T)
  {
    boolean isSame = true;

    int counter_S = 0;
    int counter_T = 0;

    while(counter_S >=0 || counter_T >= 0)
    {
      char sChar = S.charAt(counter_S);
      char tChar = T.charAt(counter_T);
      if(sChar == '#')
      {
        counter_S-=2;
      }
      if(tChar == '#')
      {
        counter_T-=2;
      }
      if(sChar != '#' && tChar != '#')
      {
        if(sChar != tChar)
          return false;
        else
        {
          counter_S--; counter_T--;
        }
      }

    }

    return isSame;
  }
}
