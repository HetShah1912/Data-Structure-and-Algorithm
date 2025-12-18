import java.util.Scanner;

public class S1L5P6 {
  static void backtrackPrintNto1(int i, int n)
  {
    if(i > n)
    {
      return;
    }
    backtrackPrintNto1(i+1,n);
    System.out.println(i);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    backtrackPrintNto1(1, n);
    sc.close();
  }
}
