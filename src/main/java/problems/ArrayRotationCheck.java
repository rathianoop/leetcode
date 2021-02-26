package problems;

public class ArrayRotationCheck
{
  public static void main(String[] args)
  {
    int[] A = {1, 2, 3, 4, 5, 6, 7};
    int[] B = {4, 5, 6, 7, 1, 2, 3};

    System.out.println(isRotation(A, B));
  }

  private static boolean isRotation(int[] A, int[] B)
  {
    int i = A[0];
    int key_i = -1;

    for(int counter = 0; counter < B.length; counter ++)
    {
      if(i == B[counter])
      {
        key_i = counter;
        break;
      }
    }

    if(key_i == -1) //return false;
    {
      return false;
    }

    for(int counter = 0; counter < A.length; counter++)
    {
      int j = (key_i + counter) % A.length;
      if(A[counter] != B[j])
      {
          return false;
      }
    }
    return true;
  }
}
