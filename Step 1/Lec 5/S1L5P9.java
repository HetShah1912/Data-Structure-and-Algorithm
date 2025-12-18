import java.util.Scanner;

public class S1L5P9 {
  
  // With 2 Variables

  // static void reverseArray(int arr[], int l, int r)
  // {
  //   if(l >= r)
  //   {
  //     return;
  //   }
  //   int temp = arr[l];
  //   arr[l] = arr[r];
  //   arr[r] = temp;
  //   reverseArray(arr, l+1, r-1);
  // }

  // With 1 Variable

  static void reverseArray(int arr[], int i, int n)
  {
    if(i >= n/2)
    {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;
    reverseArray(arr, i+1, n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }

    // With 2 Variables
    // reverseArray(arr,0,n-1);

    // With 1 Variable
    reverseArray(arr, 0 , n);
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+ " ");
    }
    sc.close();
  }
}
