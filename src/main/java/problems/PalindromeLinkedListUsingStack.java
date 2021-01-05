package problems;

import DataStructures.LinkedList.Node;

import java.util.*;

public class PalindromeLinkedListUsingStack
{
  public static void main(String[] args)
  {

    Node node4 = new Node(1, null);
    Node node3 = new Node(2, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(0, node2);
    System.out.println(isPalindrome(node1));
  }

  public static boolean isPalindrome(Node head)
  {
    int totalNode = 0;
    if(head == null || head.next == null)
      return Boolean.TRUE;

    Node temp = head;
    while(temp.next != null)
    {
      totalNode++;
      temp = temp.next;
    }
    totalNode++;
    int counter = 0;
    Stack<Integer> stack = new Stack();
    if(totalNode%2 != 0)
    {
      while(counter < totalNode/2)
      {
        stack.push(head.data);
        head = head.next;
        counter++;
      }
      head = head.next;
      if(!stack.isEmpty())
      {
        if(stack.pop() != head.data)
          return Boolean.FALSE;
        else
        {
          head = head.next;
        }
      }
    }
    else
    {
      while(counter < totalNode/2)
      {
        stack.push(head.data);
        head = head.next;
        counter++;
      }
      if(!stack.isEmpty())
      {
        if(stack.pop() != head.data)
          return Boolean.FALSE;
        else
        {
          head = head.next;
        }

      }
    }

    return Boolean.TRUE;
  }
}
