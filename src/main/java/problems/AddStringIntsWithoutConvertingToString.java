package problems;

public class AddStringIntsWithoutConvertingToString
{

  public static void main(String[] args)
  {
    System.out.println("Sum is : "+getSum("1", "9"));
    System.out.println("Sum is : "+getSum("1789", "15"));
  }

  private static String getSum(String a, String b)
  {

    StringBuilder finalValue = new StringBuilder();
    int carry = 0;
    int length1 = a.length() -1 ;
    int length2 = b.length()-1;

    while(length1 >=0 || length2 >=0)
    {
      int digit1 = length1 >=0 ? a.charAt(length1) -'0': 0;
      int digit2 = length2 >= 0 ? b.charAt(length2)-'0' : 0;
      int value = (digit1 + digit2 + carry)%10;
      carry = (digit1 + digit2 + carry)/10;
      finalValue.append(value);
      length1--;
      length2--;
    }
    if(carry >0)
      finalValue.append(carry);
    return finalValue.reverse().toString();
  }

}
