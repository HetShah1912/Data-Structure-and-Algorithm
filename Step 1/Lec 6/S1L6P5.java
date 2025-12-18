import java.util.HashMap;
import java.util.Scanner;

public class S1L6P5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // No. of Array Elements
    int n = sc.nextInt();
    int[] arr = new int[n];

    // Array
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }

    // Pre Computation
    HashMap<Integer, Integer> numbers = new HashMap<>();

    for(int i = 0; i < n; i++)
    {
      numbers.put(arr[i], numbers.getOrDefault(arr[i], 0)+1);
    }

    int q = sc.nextInt();

    while(q != 0)
    {
      int num = sc.nextInt();
      int count = numbers.getOrDefault(num, 0);
      System.out.println(num + " -> " + count);
      q--;
    }
    sc.close();
  }
}
