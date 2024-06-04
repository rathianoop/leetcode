package problems;

import problems.helper.ListNode;

import java.util.LinkedList;

public class MergeSortedLinkedList
{
  public static void main(String[] args)
  {
    LinkedList<Integer> sorted1 = new LinkedList<Integer>();
    LinkedList<Integer> sorted2 = new LinkedList<Integer>();
    //sorted1.getFirst()

    sorted1.add(1);
    sorted1.add(2);
    sorted1.add(4);

    sorted2.add(1);
    sorted2.add(3);
    sorted2.add(4);
  }


  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode temp = new ListNode(-1);
    ListNode returningNode = temp;

    while(l1 != null && l2 != null)
    {
      if(l1.val < l2.val)
      {
        temp.next = l1;
        l1 = l1.next;
      }
      else
      {
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;

    }

    if(l1 != null)
    {
      temp.next = l1;
    }
    else
    {
      temp.next = l2;
    }

    return returningNode.next;

  }
}
