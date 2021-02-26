package DataStructures.LinkedList;

public class LinkedListInitializer
{

  protected static Node populateLinkedList()
  {
    Node node5 = new Node();
    node5.data =  1;
    node5.next = null;

    Node node4 = new Node();
    node4.data = 2;
    node4.next = node5;

    Node node3 = new Node();
    node3.data = 3;
    node3.next = node4;

    Node node2 = new Node();
    node2.data = 2;
    node2.next = node3;

    Node node1 = new Node();
    node1.data = 1;
    node1.next = node2;

    return node1;
  }

  protected static Node populateLinkedList_twoElements()
  {
    Node node2 = new Node();
    node2.data = 2;
    node2.next = null;

    Node node1 = new Node();
    node1.data = 1;
    node1.next = node2;

    return node1;
  }

  protected static Node populateLinkedList_normal()
  {
    Node node5 = new Node();
    node5.data =  5;
    node5.next = null;

    Node node4 = new Node();
    node4.data = 4;
    node4.next = node5;

    Node node3 = new Node();
    node3.data = 3;
    node3.next = node4;

    Node node2 = new Node();
    node2.data = 2;
    node2.next = node3;

    Node node1 = new Node();
    node1.data = 1;
    node1.next = node2;

    return node1;
  }

  protected static Node populateLinkedList_even()
  {
    Node node4 = new Node();
    node4.data = 2;
    node4.next = null;

    Node node3 = new Node();
    node3.data = 3;
    node3.next = node4;

    Node node2 = new Node();
    node2.data = 2;
    node2.next = node3;

    Node node1 = new Node();
    node1.data = 1;
    node1.next = node2;

    return node1;
  }


}
