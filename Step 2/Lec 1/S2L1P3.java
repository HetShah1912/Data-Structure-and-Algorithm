import java.util.Scanner;

public class S2L1P3 {
  static void optimizedBubbleSort(int[] arr, int n)
  {
    int flag = 0;
    for(int i = n-1; i > 0; i--)
    {
      for(int j =0; j < i; j++)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          flag = 1;
        }
      }
      if(flag == 0)
      {
        break;
      }
      System.out.println("Running");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    optimizedBubbleSort(arr, n);
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
