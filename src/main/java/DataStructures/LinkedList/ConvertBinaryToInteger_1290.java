package DataStructures.LinkedList;


/*
could be done in tow ways - Binary to int conversion and Bit manipulation
 */
public class ConvertBinaryToInteger_1290
{
  public static void main(String[] args)
  {

  }

  private static int getIntegerValue_Binary(Node head)
  {
    int value = head.data;

    while(head.next != null)
    {
      value = value*2 + head.next.data;
      head = head.next;
    }
    return value;
  }
}
