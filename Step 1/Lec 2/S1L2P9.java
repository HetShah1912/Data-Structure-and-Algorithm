import java.util.Scanner;

public class S1L2P9 {

  // Output
  //     *    
  //    ***   
  //   *****  
  //  ******* 
  // *********
  // *********
  //  ******* 
  //   *****  
  //    ***   
  //     *   
  
  static void printPattern(int n) {
    //  Upper Part Pattern 7
    for (int i = 0; i < n; i++) {
      // Spaces
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      // Star
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      // Spaces
      for (int l = 0; l < n - i - 1; l++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    // Lower Part Pattern 8
    for (int i = 0; i < n; i++) {
      // Spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // Star
      for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
        System.out.print("*");
      }
      // Spaces
      for (int l = 0; l < i; l++) {
        System.out.print(" ");
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
