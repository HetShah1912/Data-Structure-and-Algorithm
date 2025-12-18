import java.util.Scanner;

public class S2L2P4 {
  static void recursiveInsertionSort(int arr[], int i, int n)
  {
    if(i == n)
    {
      return;
    }
    int j = i;
    while(j > 0 && arr[j-1] > arr[j])
    {
      int temp = arr[j];
      arr[j] = arr[j-1];
      arr[j-1] = temp;
      j--;
    }
    recursiveInsertionSort(arr, i+1, n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    recursiveInsertionSort(arr, 0, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
