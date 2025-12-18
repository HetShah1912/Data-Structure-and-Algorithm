import java.util.Scanner;

public class S3L2P3{
  static void moveZeros(int[] arr)
  {
    // My Solution
    // int k = 0;
    // for(int i = 0; i < arr.length; i++)
    // {
    //   if(arr[i] != 0)
    //   {
    //     arr[k] = arr[i];
    //     k++;
    //   }
    // }
    // for(int i = k; i < arr.length; i++)
    // {
    //     arr[i] = 0;
    // }

    // Brute Force
    // int n = arr.length;
    // int k = 0;
    // int[] temp = new int[n];
    // for(int i = 0; i < n; i++)
    // {
    //   {
    //     if(arr[i] != 0)
    //     {
    //       temp[k] = arr[i];
    //       k++;
    //     }
    //   }
    // }
    // for(int i = 0; i < k; i++)
    // {
    //   arr[i] = temp[i];
    // }
    // for(int i = k; i < n; i++)
    // {
    //   arr[i] = 0;
    // }

    // Optimal
    int j = -1;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == 0)
      {
        j = i;
        break;
      }
    }
    for(int i = j+1; i < arr.length; i++)
    {
      if(arr[i] != 0)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    moveZeros(num);
    for(int i = 0; i < n; i++)
    {
      System.out.print(num[i] + " ");
    }
    sc.close();
  }
}