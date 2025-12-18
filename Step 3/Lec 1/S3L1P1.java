import java.util.Scanner;

public class S3L1P1 {
  static int largestElement(int[] arr)
  {
    int largest = arr[0];
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > largest)
      {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    int largest = largestElement(num);
    System.out.println(largest);
    sc.close();
  }
}
