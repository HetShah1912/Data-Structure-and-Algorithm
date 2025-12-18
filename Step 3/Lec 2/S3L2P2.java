import java.util.Scanner;

public class S3L2P2 {
  static void leftRotateDPlaces(int[] arr, int d)
  {
    // Brute Force

    // int[] temp = new int[d];
    // for(int i = 0; i < d; i++)
    // {
    //   temp[i] = arr[i];
    // }
    // for(int i = d; i < arr.length; i++)
    // {
    //   arr[i-d] = arr[i];
    // }
    // for(int i = (arr.length-d); i < arr.length; i++)
    // {
    //   arr[i] = temp[i-(arr.length-d)];
    // }

    // Optimal Solution
    reverseArray(arr, 0, d-1);
    reverseArray(arr, d, arr.length-1);
    reverseArray(arr, 0, arr.length-1);

  }
  static void reverseArray(int[] arr,int start, int end)
  {
    while(start <= end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    leftRotateDPlaces(num, d);
    for(int i = 0; i < n; i++)
    {
      System.out.print(num[i] + " ");
    }
    sc.close();
  }
}
