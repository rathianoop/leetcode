package datastructures.linkedlist;

public class MyLinkedList
{
  Node head;

  public void insert(int data)
  {
    Node node = new Node();
    node.data = data;
    if (head == null)
      head = node;
    else
    {
      Node temp = head;
      while (temp.next != null)
      {
        temp = temp.next;
      }
      temp.next = node;
    }
  }

  public void show()
  {
    Node node = head;
    while (node.next != null)
    {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
  }

  public void insertAtStart(int data)
  {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int indexValue, int data)
  {
    Node node = new Node(data);
    Node n = head;
    if(indexValue == 0)
    {
      insertAtStart(data);
    }
    else
    {
      for (int currentIndex = 0; currentIndex < indexValue - 1; currentIndex++)
      {
        n = n.next;
      }
      node.next = n.next;
      n.next = node;
    }
  }


  public void delete(int deleteIndex)
  {
    if(deleteIndex == 0)
    {
      head = head.next;
    }
    else
    {
      Node currentNode = head;
      for(int currentIndex = 0; currentIndex < deleteIndex -1 ; currentIndex++)
      {
        currentNode = currentNode.next;
      }
      currentNode.next = currentNode.next.next;
    }
  }

}
