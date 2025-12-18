import java.util.Scanner;

public class S1L2P14 {
  
  // Output 
  // A 
  // A B 
  // A B C 
  // A B C D 
  // A B C D E 
  
  static void printPattern(int n)
  {
    for(int i = 0; i < n; i++)
    {
      for(char ch = 'A'; ch <= 'A' + i; ch++)
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
