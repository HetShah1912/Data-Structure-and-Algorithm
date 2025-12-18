import java.util.HashMap;
import java.util.Scanner;

public class S1L6P6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    
    // Pre Computation
    HashMap<Character, Integer> numbers = new HashMap<>();

    for(int i = 0; i < str.length(); i++)
    {
      numbers.put(str.charAt(i), numbers.getOrDefault(str.charAt(i), 0)+1);
    }

    int q = sc.nextInt();

    while(q != 0)
    {
      char ch = sc.next().charAt(0);
      int count = numbers.getOrDefault(ch, 0);
      System.out.println(ch + " -> " + count);
      q--;
    }
    sc.close();
  }
}
