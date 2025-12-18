import java.util.Scanner;

public class S3L1P3 {
  static boolean isSorted(int[] num)
  {
    for(int i = 0; i < (num.length)-1; i++)
    {
      if(num[i+1] < num[i])
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 

    for(int i = 0; i < n; i++)
    {
      num[i] = sc.nextInt();
    }

    boolean sorted = isSorted(num);
    System.out.println(sorted);
    sc.close();
  }
}
