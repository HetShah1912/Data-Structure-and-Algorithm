import java.util.HashMap;
import java.util.Map;

public class S1L3_Map {
  public static void main(String[] args) {

    Map<String, Integer> numbers = new HashMap<>();

    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three", 3);
    

    System.out.println(numbers); 

    // if(!numbers.containsKey("Two"))
    // {
    //   numbers.put("Two", 23);
    // }

    numbers.putIfAbsent("Two", 12);

    for(Map.Entry<String, Integer> e: numbers.entrySet())
    {
      System.out.println(e);
    }

    System.out.println(numbers.containsKey("Two"));

    System.out.println(numbers.containsValue(3));

    System.out.println(numbers.keySet());
    System.out.println(numbers.values());
  
  }
}
