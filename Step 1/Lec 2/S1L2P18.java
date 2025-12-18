import java.util.Scanner;

public class S1L2P18 {

  // Output
  // E 
  // D E 
  // C D E 
  // B C D E 
  // A B C D E 

  static void printPattern(int n)
  {
    for(int i = 0; i < n; i++)
    {
      for(char ch = (char)('E'-i); ch <= 'E'; ch++)
      {
        System.out.print(ch + " ");
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
