import java.util.Scanner;

public class S1L2P10 {

  // Output
  // *
  // **
  // ***
  // ****
  // *****
  // ****
  // ***
  // **
  // *
  
  static void printPattern(int n)
  {
    // int k = (n/2);
    // for(int i = 0; i < k; i++)
    // {
    //   for(int j = 0; j <= i; j++)
    //   {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i = k+1; i < n; i++)
    // {
    //   for(int j = 0; j < n-i; j++)
    //   {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    for(int i = 1; i <= 2*n-1; i++)
    {
      int stars = i;
      if(i > n)
      {
        stars = 2*n-i;
      }
      for(int j = 1; j <= stars; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}
