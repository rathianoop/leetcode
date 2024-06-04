package datastructures.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList
{
  public static void main(String[] args)
  {
    LinkedList<Integer> list = new LinkedList<>();

    Node node5 = new Node();
    node5.data = 5;
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

    //reverseList_Iterative(node1);
    Node reversedHead = reverseList_Recursive(null, node1);
    while(reversedHead != null)
    {
      System.out.println(reversedHead.data);
      reversedHead = reversedHead.next;
    }
  }

  public static Node reverseList_Iterative(Node head) {


    Node prev = null;
    Node curr = head;
    while (curr != null) {

      Node temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;

    }
    return prev;
  }


  public static Node reverseList_Recursive(Node headNode, Node head) {

    if (head == null)
      return headNode;

    Node temp = head.next;
    head.next = headNode;
    headNode = head;
    head = temp;
    return reverseList_Recursive(headNode, head);
  }

  /*public static Node reverseList_Recursive(Node headNod) {

    if (head == null || head.next == null)
      return head;
    Node p = reverseList_Recursive(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }*/
}
