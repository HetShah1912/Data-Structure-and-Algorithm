import java.util.Scanner;

public class S1L2P12 {
  
  // Output
  // 1                 1 
  // 1 2             2 1 
  // 1 2 3         3 2 1 
  // 1 2 3 4     4 3 2 1 
  // 1 2 3 4 5 5 4 3 2 1 

  static void printPattern(int n)
  {
    int space = 2* (n-1);
    for(int i = 1; i <= n; i++)
    {
      // Numbers
      for(int j = 1; j <= i; j++)
      {
        System.out.print(j + " ");
      }
      //Space
      for(int j = 1; j <= space; j++)
      {
        System.out.print("  ");
      }
      //Numbers
      for(int j = i; j >= 1; j--)
      {
        System.out.print(j + " ");
      }
      System.out.println();
      space -= 2;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}
