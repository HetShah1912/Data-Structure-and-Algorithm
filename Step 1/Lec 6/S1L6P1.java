import java.util.Scanner;

public class S1L6P1 {
  static int freq(int arr[], int key)
  {
    int count = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == key)
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    } 

    for(int i = 0; i < n; i++)
    {
      int count = freq(arr, arr[i]);
      System.out.println(arr[i] + "->" + count);
    }

    
    sc.close();
  }
}
