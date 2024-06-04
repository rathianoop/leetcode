package datastructures.stack;

public class MyStack
{

  int stack[] = new int[5];
  int top = 0;
  public void push(int data)
  {
    stack[top] = data;
    top++;
  }

  public void show()
  {
    for(int index = top-1; index >= 0; index --)
    {
      System.out.println("stack element in order from Top "+stack[index]);
    }
  }

  public int pop()
  {
    int data = stack[top-1];
    stack[top-1] = 0;
    return data;
  }

  public int peek()
  {
    return stack[top-1];
  }
}
