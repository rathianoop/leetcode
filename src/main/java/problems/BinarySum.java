package problems;

public class BinarySum
{

  public static void main(String[] args)
  {
    System.out.println(getSum("1010", "1011"));
  }

  private static String getSum(String a, String b)
  {
    StringBuilder stringBuilder = new StringBuilder();
    int len1 = a.length() -1 ;
    int len2 = b.length()-1;
    int carry = 0;

    while(len1 >=0 || len2 >= 0)
    {
      int int1 = len1 >=0 ? a.charAt(len1) -'0' : 0;
      int int2 = len2 >=0 ? b.charAt(len2) -'0' : 0;

      int digit = (int1 + int2 + carry)%2;
      carry = (int1 + int2 + carry)/2;
      stringBuilder.append(digit);
      len1--;
      len2--;

    }
    if(carry != 0)
      stringBuilder.append(carry);

    return stringBuilder.reverse().toString();





  }
}
