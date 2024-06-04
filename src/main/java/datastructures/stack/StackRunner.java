package datastructures.stack;

public class StackRunner
{
  public static void main(String[] args)
  {

    MyStack myStack = new MyStack();
    myStack.push(5);
    myStack.push(10);
    myStack.push(15);
    myStack.push(20);
    myStack.show();
    System.out.println("Peeked data : "+myStack.peek());
    myStack.show();
    System.out.println("Popped data: "+myStack.pop());
    myStack.show();

    char[] charArray = "Alpha".toCharArray();

    //TODO Implement size and isEmpty as well if you want

  }
}
