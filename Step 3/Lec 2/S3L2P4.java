import java.util.Scanner;

public class S3L2P4 {
  static int linearSearch(int[] arr, int key)
  {
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == key)
      {
        return i;
      }
    }
    return (-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int key = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    int pos = linearSearch(num, key);
    if(pos == -1)
    {
      System.out.println("Key not Found");
    }
    else{
      System.out.println("Key found at "+pos+" index");
    }
    sc.close();
  }
}
