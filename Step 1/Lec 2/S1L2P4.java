import java.util.Scanner;

public class S1L2P4 {

  // Output
  // 1 
  // 2 2 
  // 3 3 3 
  // 4 4 4 4 
  // 5 5 5 5 5 
  
  static void printPattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1 + " ");
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
