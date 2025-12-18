import java.util.Scanner;

public class S2L1P4 {
  static void insertionSort(int[] arr, int n)
  {
    for(int i = 1; i < n; i++)
    {
      int j = i;
      while(j > 0 && arr[j-1] > arr[j])
      {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
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
    insertionSort(arr, n);
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
