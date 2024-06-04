package datastructures.linkedlist;

public class LinkedListRunner
{
  public static void main(String[] args)
  {
      MyLinkedList myLinkedList = new MyLinkedList();
      myLinkedList.insert(18);
      myLinkedList.insert(45);
      myLinkedList.insert(12);
      myLinkedList.insertAtStart(25);
      myLinkedList.insertAt(3, 55);
      myLinkedList.insertAt(0, 10);
      myLinkedList.show();
      myLinkedList.delete(2);
    System.out.println("Compare delete list");
      myLinkedList.show();

  }

}
