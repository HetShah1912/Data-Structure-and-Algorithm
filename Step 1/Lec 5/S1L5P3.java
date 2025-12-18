import java.util.Scanner;

public class S1L5P3 {
  static void recursivePrint1toN(int i, int n)
  {
    if(i > n)
    {
      return;
    }
    System.out.println(i);
    recursivePrint1toN(i+1, n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    recursivePrint1toN(1, n);
    sc.close();
  }
}
