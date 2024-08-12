import java.util.Iterator;
import java.util.Stack;
public class Create
{
  public static void main(String[]args)
  {
    // Create an Object for Stack
    // Load Values in Stack
    // Iterate it by usig Iterator and While Loops
    Stack<Integer> a=new Stack<>();
    a.add(5);
    a.add(0);
    a.add(9);
    Iterator i=a.iterator();
    while (i.hasNext()) 
    {
      System.out.println(i.next());
    }
  }
}
  
