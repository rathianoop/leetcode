package datastructures.linkedlist;

public class RemoveElement_Trying
{
  public static void main(String[] args)
  {
    Node result = removeNode(LinkedListInitializer.populateLinkedList(), 2);
    while(result != null && result.next != null)
    {
      System.out.println(result.data);
      result = result.next;
    }
  }

  private static Node removeNode(Node head, int val)
  {

    while(head != null && head.data == val)
    {
        head = head.next;
    }

    Node temp = head;
    while(temp!= null && temp.next != null)
    {
      if(temp.next.data == val)
      {
        temp.next = temp.next.next;
      }
      else
        temp = temp.next;
    }
    return head;
  }

}
