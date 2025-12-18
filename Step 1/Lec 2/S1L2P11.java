import java.util.Scanner;

public class S1L2P11 {

  // Output
  // 1 
  // 0 1 
  // 1 0 1 
  // 0 1 0 1 
  // 1 0 1 0 1
   
  static void printPattern(int n)
  {
    int start;
    for(int i = 0; i < n; i++)
    {
      if ( i % 2 == 0)
      {
        start = 1;
      }
      else{
        start = 0;
      }
      for(int j = 0; j <= i; j++)
      {
        System.out.print(start + " ");
        start = 1 - start;
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
