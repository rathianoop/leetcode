package problems;

public class SumOfDigitMinNumber_1085
{
  public static void main(String[] args)
  {
    //int[] A = new int[]{69,48,39,9,63,31,13,38,43,42,56,45,80,11,57,10,26,23,99,47,40};
    //int[] A = new int[]{99,77,33,66,55};
    int[] A = new int[]{34,23,1,24,75,33,54,8};
    System.out.println(sumOfDigits(A));
  }

  public static int sumOfDigits(int[] A) {

    int min = 101;

    for(int number: A)
    {
      if(number< min)
        min = number;
    }
    System.out.println(min);
    int digitSum = 0;
    while(min>0)
    {
      int d = min%10;
      min = min/10;
      digitSum+=d;
    }

    if(digitSum%2 != 0)return 0;
    return 1;

  }
}

