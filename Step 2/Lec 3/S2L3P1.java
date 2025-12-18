import java.util.Scanner;

public class S2L3P1 {
  static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int p = partition(arr, low, high);
      quickSort(arr, low, p - 1);
      quickSort(arr, p + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i < high) {
        i++;
      }
      while (arr[j] > pivot && j > low) {
        j--;
      }
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    quickSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
