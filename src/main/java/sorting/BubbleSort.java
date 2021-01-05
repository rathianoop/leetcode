package sorting;

public class BubbleSort
{

  public static void main(String[] args)
  {
    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    //binary sort's BigO complexity is O(n2) n square i.e quadratic
    //it compares the two elements and based on how you want the sorting, it swaps the element and after every
    //pass, the last element of the array is the biggest if you are sorting ascending.
    // so in this example, after the first pass, the last element in the array will be 55

    //also, you will have to decrement the final place of the array because after every pass, the last element of that pass will be the biggest


    for(int iteration = intArray.length -1; iteration > 0; iteration --)
    {
      for(int innerIteration = 0; innerIteration < iteration; innerIteration ++)
      {
          if(intArray[innerIteration] > intArray[innerIteration+1])
          {
            swap(intArray, innerIteration, innerIteration + 1);
          }
      }

    }

    for(int intFromArray : intArray)
      System.out.println("Value : "+intFromArray);
  }

  private static int[] swap(int[] arrayToSwap, int indexOfSmallerNumber, int indexOfGreaterNumber)
  {
    if(indexOfSmallerNumber == indexOfGreaterNumber)
      return arrayToSwap;

    int tempForSwapping = arrayToSwap[indexOfSmallerNumber];
    arrayToSwap[indexOfSmallerNumber] = arrayToSwap[indexOfGreaterNumber];
    arrayToSwap[indexOfGreaterNumber] = tempForSwapping;
    return arrayToSwap;
  }
}
