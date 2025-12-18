// import java.util.Iterator;
import java.util.Scanner;
// import java.util.Set;
// import java.util.TreeSet;

public class S3L1P4 {
  static int removeDuplicate(int[] arr)
  {
    int k = 0;
    for(int i = 1; i < arr.length; i++)
    {
      if(arr[i] != arr[k])
      {
        arr[k+1] = arr[i];
        k++;
      }
    }
    for(int i = 0; i < k+1; i++)
    {
      System.out.println(arr[i]);
    }
    return (k+1);


    // Brute Force
    // Set<Integer> unique = new TreeSet<>();
    // for(int i =0; i < arr.length; i++)
    // {
    //   unique.add(arr[i]);
    // } 

    // int k = 0;
    // for (int elem : unique) 
    // {
    //   arr[k] = elem;
    //   System.out.println(arr[k]);
    //   k++;
    // }
    // return k;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }
    // System.out.println(num[0]);

    int noDuplicate = removeDuplicate(num);
    System.out.println(noDuplicate);
    sc.close();
  }
}
