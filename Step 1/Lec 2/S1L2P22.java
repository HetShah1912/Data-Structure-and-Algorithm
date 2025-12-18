import java.util.Scanner;

public class S1L2P22 {

  // Output
  // 4 4 4 4 4 4 4 
  // 4 3 3 3 3 3 4 
  // 4 3 2 2 2 3 4 
  // 4 3 2 1 2 3 4 
  // 4 3 2 2 2 3 4 
  // 4 3 3 3 3 3 4 
  // 4 4 4 4 4 4 4 
  
  static void printPattern(int n)
  {
    for(int i = 0; i < 2*n-1; i++)
    {
      for(int j = 0; j < 2*n-1; j++)
      {
        int top = i;
        int left = j;
        int bottom = (2*n - 1) - 1 - i;
        int right = (2*n - 1) - 1 - j;
        System.out.print((n - Math.min(Math.min(top, bottom),Math.min(right, left))) + " ");
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
