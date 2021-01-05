package DataStructures.LinkedList;

public class NodeLinkedList
{
  public NodeLinkedList next;
  public int val;

  public NodeLinkedList(){}
  public NodeLinkedList(int val){this.val = val;}
  public NodeLinkedList(int val, NodeLinkedList node){this.val = val; this.next = node;}

  public NodeLinkedList addNode(NodeLinkedList newNode)
  {
    NodeLinkedList temp = next.next;
    while(temp != null)
    {
      temp = temp.next;

    }
    temp.next = newNode;
    return next;
  }

  public void printLinkedList()
  {
    NodeLinkedList currentNode = next;
    while(currentNode.next != null)
    {
      System.out.println(currentNode.val);
      currentNode = currentNode.next;
    }

  }

}
