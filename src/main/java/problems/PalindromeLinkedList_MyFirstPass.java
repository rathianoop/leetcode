package problems;

import java.util.*;

public class PalindromeLinkedList_MyFirstPass
{
  public static void main(String[] args)
  {


    List<Integer> linkedList = new LinkedList<Integer>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(1);

    System.out.println(isPalindrome(linkedList));

  }

  private static boolean isPalindrome(List<Integer> linkedList)
  {
    Set<Integer> numberSet = new HashSet<Integer>();
    for(Integer number : linkedList)
    {
      numberSet.add(number);
    }

    if((linkedList.size()%2 == 0) && (numberSet.size() == linkedList.size()/2))
      return Boolean.TRUE;
    else if(!(linkedList.size()%2 == 0) && (numberSet.size() == (linkedList.size()/2)+1))
      return Boolean.TRUE;

    return Boolean.FALSE;
  }
}
