import java.util.Scanner;

public class S2L2P1 {
  static void mergeSort(int[] arr, int low, int high)
  {
    if(low >= high)
    {
      return;
    }
    else
    {
      int mid = (low + high)/2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid+1, high);
      merge(arr, low, mid, high);
    }
  }
  static void merge(int[] arr, int low, int mid, int high)
  {
    int left = low;
    int right = mid+1;
    int k = low;
    int[] temp = new int[high + 1];

    while(left <= mid && right <= high)
    {
      if(arr[left] <= arr[right])
      {
        temp[k] = arr[left];
        left++;
        k++;
      }
      else{
        temp[k] = arr[right];
        right++;
        k++;
      }
    }

    while(left <= mid)
    {
      temp[k] = arr[left];
      left++;
      k++;
    }
    while(right <= high)
    {
      temp[k] = arr[right];
      right++;
      k++;
    }

    for(k = low; k <= high; k++)
    {
      arr[k] = temp[k];
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
    mergeSort(arr, 0, n-1);
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
