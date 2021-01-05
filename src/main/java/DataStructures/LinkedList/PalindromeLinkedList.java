package DataStructures.LinkedList;

public class PalindromeLinkedList
{

  public static void main(String[] args)
  {
    System.out.println(isPalindrome(LinkedListInitializer.populateLinkedList()));
  }

  private static boolean isPalindrome(Node head)
  {
    Node slow = head;
    Node fast = head;
    while(fast.next != null && fast.next.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;
    }

    Node secondHalfHead = slow.next;
    Node startingHeadNode = head;

    secondHalfHead = reverseLinkedList(secondHalfHead);
    while(startingHeadNode != null && secondHalfHead != null)
    {
      if(secondHalfHead.data != startingHeadNode.data)
              return false;
      startingHeadNode = startingHeadNode.next;
      secondHalfHead = secondHalfHead.next;
    }

    return Boolean.TRUE;
  }

  private static Node reverseLinkedList(Node temp)
  {

    Node rev = null;
    if(temp == null)
      return temp;

    while(temp!= null)
    {
      Node revNode = temp.next;
      temp.next = rev;
      rev = temp;
      temp = revNode;
    }
    return rev;
  }
}
