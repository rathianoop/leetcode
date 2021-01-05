package problems;

public class SubsProdAndSumOfDigits
{
  public static void main(String[] args)
  {
    System.out.println(getTheDifference(114));
    System.out.println(getTheDifference(1));
  }

  private static int getTheDifference(int n)
  {
    int sum = 0;
    int mul = 1;
    int temp = n;

    while(temp > 0 )
    {
      int number = temp%10;
      sum+=number;
      mul*= number;
      temp = temp/10;
    }

    return mul-sum;
  }
}
