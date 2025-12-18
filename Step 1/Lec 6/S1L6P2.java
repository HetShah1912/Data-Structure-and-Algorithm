import java.util.Scanner;

public class S1L6P2 {
  
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
    int maxElement = 13;
    int[] hash = new int[maxElement];

    for(int i = 0; i < n; i++)
    {
      hash[arr[i]] += 1;
    }

    // No. of Queries or Element you search
    int q = sc.nextInt();
    while (q!=0) {
      int num = sc.nextInt();
      System.out.println(hash[num]);
      q--;
    }
    sc.close();
  }
}
