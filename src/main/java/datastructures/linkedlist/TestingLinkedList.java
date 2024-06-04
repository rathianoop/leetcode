package datastructures.linkedlist;

public class TestingLinkedList
{
  public static void main(String[] args)
  {

    Node node = LinkedListInitializer.populateLinkedList_normal();
    Node reversedNode  = getFinalNode(node);
    while(reversedNode != null)
    {
      System.out.println(reversedNode.data);
      reversedNode = reversedNode.next;
    }

      reversedNode  = getFinalNode(node);
    while(reversedNode != null)
    {
      System.out.println(reversedNode.data);
      reversedNode = reversedNode.next;
    }
  }

  private static Node getFinalNode(Node node)
  {
    Node toRev = node;
    Node prev = null;
    while(toRev != null)
    {
      Node tempNode = toRev.next;
      toRev.next = prev;
      prev = toRev;
      toRev = tempNode;
    }

    return prev;
  }

  private static Node getFinalNode1(Node node)
  {
    Node toRev = node;
    Node prev = null;
    while(toRev != null)
    {
      Node tempNode = toRev.next;
      toRev.next = prev;
      prev = toRev;
      toRev = tempNode;
    }

    return node;
  }
}
