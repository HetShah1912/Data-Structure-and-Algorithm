import java.util.Scanner;
public class S1L5P5 {
  static void backtrackPrint1toN(int i, int n)
  {
    if(i < 1)
    {
      return;
    }
    backtrackPrint1toN(i-1, n);
    System.out.println(i);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    backtrackPrint1toN(n, n);
    sc.close();
  }
}

