import java.util.Enumeration;
import java.util.Stack;
public class Enumerations 
{
  String name;
  int age;
  public Enumerations(String name, int age) 
  {
    this.name = name;
    this.age = age;
  }
  public String toString() 
  {
    return "Name: " + name + ", Age: " + age;
  }
  public static void main(String[] args) 
  {
    // Create an Object for Stack
    // Load person class Objects in it
    // Iterate it by using Enumeration
    // print the values by using while Loop
    Stack<Enumerations> personStack = new Stack<>();
    personStack.push(new Enumerations("Kavitha", 22));
    personStack.push(new Enumerations("Sujatha", 22));
    personStack.push(new Enumerations("Swarupa", 21));
    Enumeration<Enumerations> enumeration = personStack.elements();
    System.out.println("Iterating using Enumeration:");
    while (enumeration.hasMoreElements()) 
    {
      Enumerations p = enumeration.nextElement();
      System.out.println(p);
    }
  }
}
    