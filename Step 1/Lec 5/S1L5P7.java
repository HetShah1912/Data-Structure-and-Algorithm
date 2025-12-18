import java.util.Scanner;

public class S1L5P7 {

  // Parameterized Way
  
  // static void sum1toN(int n, int sum)
  // {
  //   if(n < 1)
  //   {
  //     System.out.println(sum);
  //     return;
  //   }
  //   sum1toN(n-1, sum+n);
  // }

  // Functional Way

  static int sum1toN(int n)
  {
    if(n == 0)
    {
      return 0;
    }
    return n + sum1toN(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // sum1toN
    int result = sum1toN(n);
    System.out.println(result);
    sc.close();
  }
}
