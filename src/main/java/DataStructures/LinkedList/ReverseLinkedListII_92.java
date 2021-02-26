package DataStructures.LinkedList;

import java.util.LinkedList;

public class ReverseLinkedListII_92
{

  public static void main(String[] args)
  {
    Node node = getReversed(LinkedListInitializer.populateLinkedList_normal(), 2, 4);
    while(node != null)
    {
      System.out.println(node.data);
      node = node.next;
    }

    LinkedList list = new LinkedList();
    list.add(3);
    list.add(5);

    Node returnedNode = getReversed(LinkedListInitializer.populateLinkedList_twoElements(), 1, 2);
    while(returnedNode != null)
    {
      System.out.println(returnedNode.data);
      returnedNode = returnedNode.next;
    }

  }

  private static Node getReversed(Node head, int m, int n)
  {
    Node parsingNode = head;
    int nCounter = 1;
    int counter = 1;
    Node startNode = head;

    while(counter < m)
    {
      startNode = parsingNode;
      parsingNode = parsingNode.next;
      counter++;
    }

    Node tempNode = null, tail = parsingNode;
    while(counter >=m && counter <= n)
    {
      Node temp = parsingNode.next;
      parsingNode.next = tempNode;
      tempNode = parsingNode;
      parsingNode = temp;
      counter++;
    }
    startNode.next = tempNode;
    tail.next = parsingNode;

    return m ==1 ? tempNode : head;
  }
}
