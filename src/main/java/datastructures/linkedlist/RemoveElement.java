package datastructures.linkedlist;

public class RemoveElement
{
  public static void main(String[] args)
  {
    Node result = removeElement(LinkedListInitializer.populateLinkedList(), 2);
    while(result.next != null)
    {
      System.out.println(result.data);
      result = result.next;
    }
  }

  private static Node removeElement(Node head, int val)
  {
    if(head == null)
      return null;
    if(head.data == val)
      return removeElement(head.next, val);
    head.next = removeElement(head.next, val);

    return head;
  }
}
