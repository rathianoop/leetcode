public class Palindrome
{

  /*
  Runtime: 6 ms, faster than 99.97% of Java online submissions for Palindrome Number.
  Memory Usage: 38.4 MB, less than 7.23% of Java online submissions for Palindrome Number.
   */
  //TODO how to stop half way and use that to compare
  public static void main(String[] args)
  {
    int number1 = 12321;
    int number2 = 12345;

    System.out.println(checkPalindrome(number1));
    System.out.println(checkPalindrome(number2));
  }

  private static boolean checkPalindrome(int number)
  {
    long reversedNumber = 0;
    int inputNumber = number;
    if (number < 0)
      return Boolean.FALSE;

    while (number > 0)
    {
      reversedNumber = reversedNumber * 10 + number % 10;
      number = number / 10;
    }
    if (reversedNumber > Integer.MAX_VALUE)
    {
      return false;
    }

    if (reversedNumber == inputNumber)
      return Boolean.TRUE;

    return Boolean.FALSE;
  }
}
