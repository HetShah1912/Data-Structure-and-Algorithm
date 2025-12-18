import java.util.Scanner;

public class S3L2P1 {
  static void leftRotate(int[] arr)
  {
    int temp = arr[0];
    for(int i = 1; i < arr.length; i++)
    {
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    leftRotate(num);
    for(int i = 0; i < n; i++)
    {
      System.out.print(num[i] + " ");
    }
    sc.close();
  }
}
