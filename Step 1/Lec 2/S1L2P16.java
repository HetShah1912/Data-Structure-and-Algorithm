import java.util.Scanner;

public class S1L2P16 {

  // Output
  // A 
  // B B 
  // C C C 
  // D D D D 
  // E E E E E 
  
  static void printPattern(int n)
  {
    for(char i = 0; i < n ; i++)
    {
      char ch = (char)('A' + i);
      for(int j = 0; j <= i; j++)
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
