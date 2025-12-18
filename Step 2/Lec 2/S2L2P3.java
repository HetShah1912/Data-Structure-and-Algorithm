import java.util.Scanner;

public class S2L2P3 {
  static void recursiveSelectionSort(int[] arr, int i, int n) {
    if (i == n-1) {
      return;
    }
    int min = i;
    for (int j = i + 1; j < n; j++) {
      if (arr[j] < arr[min])
      {
        min = j;
      }
    }
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
    recursiveSelectionSort(arr, i + 1, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    recursiveSelectionSort(arr, 0, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
