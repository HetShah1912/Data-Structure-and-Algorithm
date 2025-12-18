import java.util.HashMap;
import java.util.Scanner;

public class S1L6P7 {
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

    int maxFreq = 0;
    int maxNum = 0;
    for(int i = 0; i < n; i++)
    {
      numbers.put(arr[i], numbers.getOrDefault(arr[i], 0)+1);
      
      int freq = numbers.get(arr[i]);
      if(maxFreq < freq)
      {
        maxFreq = freq;
        maxNum = arr[i];
      }
    }

    // Wrong Snippet
    // int max = 0;
    // for(int i = 0; i < n; i++)
    // {
    //   numbers.put(arr[i],numbers.getOrDefault(arr[i], 0)+1);

    //   if (max < numbers.get(arr[i]))
    //   {
    //     max = arr[i];
    //   }
    // }

    int q = sc.nextInt();

    while(q != 0)
    {
      int num = sc.nextInt();
      int count = numbers.getOrDefault(num, 0);
      System.out.println(num + " -> " + count);
      q--;
    }
    System.out.println("Most Occurence Digit is : "+maxNum+" with frequency : "+maxFreq);

    // System.out.println(max);
    sc.close();
  }
}

