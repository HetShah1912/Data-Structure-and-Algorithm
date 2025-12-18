import java.util.Scanner;

public class S3L1P2 {
  static int secondLargestElement(int[] arr)
  {
    int largest = arr[0];
    int prevLargest = -1;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > largest)
      {
        prevLargest = largest;
        largest = arr[i];
      }
      else if(arr[i] > prevLargest && arr[i] < largest)
      {
        prevLargest = arr[i];
      }
    }

    
    return prevLargest;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    int largest = secondLargestElement(num);
    System.out.println(largest);
    sc.close();
  }
}
