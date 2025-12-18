import java.util.Scanner;

public class S2L1P1{
  static void selectionSort(int[] arr, int n)
  {
    int min;
    for(int i = 0; i < n-1; i++)
    {
      min = i;
      for(int j = i; j < n; j++)
      {
        if(arr[min] > arr[j])
        {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
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
    selectionSort(arr, n);
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}