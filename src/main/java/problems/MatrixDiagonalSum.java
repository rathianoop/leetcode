package problems;

public class MatrixDiagonalSum
{
  public static void main(String[] args)
  {
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] mat_even = {{1,1,1,1},{1,1,1,1},{1,1,1,1}, {1,1,1,1}};
    System.out.println(mat.length);
    System.out.println(mat[0].length);

    System.out.println(getSum(mat));
    System.out.println(getSum(mat_even));
  }

  private static int getSum(int [][] mat)
  {
    if(mat.length != mat[0].length)
    {
      return 0;
    }
    int sum = 0;
    for(int count = 0; count < mat.length; count++)
    {
      if(mat.length%2 == 1 && count == (mat.length/2))
      {
        sum+=mat[count][count];
      }else
      {
        sum+= mat[count][count] + mat[count][mat.length-1-count];
      }

    }
    return sum;
  }

}
