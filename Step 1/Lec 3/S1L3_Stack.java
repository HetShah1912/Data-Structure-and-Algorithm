import java.util.Stack;

public class S1L3_Stack {
  public static void main(String[] args) {
    
    // Stack
    Stack<String> animals = new Stack<>();
    
    // Add Element
    animals.push("Lion");
    animals.push("Dog");
    animals.push("Horse");
    animals.push("Cat");

    System.out.println(animals);
    
    // Get top Element
    System.out.println(animals.peek());

    // Remove top Element
    animals.pop();
    System.out.println(animals);

    System.out.println(animals.peek());
  }
}
