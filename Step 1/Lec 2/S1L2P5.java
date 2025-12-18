import java.util.Scanner;

public class S1L2P5 {

  // Output
  // * * * * * 
  // * * * * 
  // * * * 
  // * * 
  // * 
  
  static void printPattern(int n) {
    // Striver Solution
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    // Solution by Het Shah
    // for(int i = 0; i < n; i++)
    // {
    // for(int j = i; j < n; j++)
    // {
    // System.out.print("* ");
    // }
    // System.out.println();
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}
