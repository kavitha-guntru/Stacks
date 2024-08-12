import java.util.ListIterator;
import java.util.Stack;

public class Dynamic{
  String name;
  int age;


  public Dynamic(String name, int age)
  {
    this.name = name;
    this.age = age;

  }
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop

  Stack<Dynamic> person = new Stack<>();
  person.push(new Dynamic("kavitha",25));
  ListIterator<Dynamic> listIterator = person.listIterator();
  while (listIterator.hasNext()) 
  {
    Dynamic l = listIterator.next();
    System.out.println("Name: " + l.name + ", Age: " + l.age);
  }
}
}