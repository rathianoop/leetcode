package datastructures.linkedlist;

public class MiddleOfLinkedList_876
{
  public static void main(String[] args)
  {
   /* Node middleNode = getMiddleNode(LinkedListInitializer.populateLinkedList());
    while(middleNode != null)
    {
      System.out.println(middleNode.data);
      middleNode = middleNode.next;
    }*/

    Node middleNode_even = getMiddleNode(LinkedListInitializer.populateLinkedList_even());
    while(middleNode_even != null)
    {
      System.out.println(middleNode_even.data);
      middleNode_even = middleNode_even.next;
    }

  }

  private static Node getMiddleNode(Node head)
  {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

}
