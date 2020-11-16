package DataStructures;

public class LinkedList_MyImplementation
{
  int val;
  LinkedList_MyImplementation next;

  public LinkedList_MyImplementation()
  {
  }

  public LinkedList_MyImplementation(int val)
  {
    this.val = val;
  }

  public LinkedList_MyImplementation(int val, LinkedList_MyImplementation next)
  {
    this.val = val;
    this.next = next;
  }


}
