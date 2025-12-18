import java.util.Scanner;

public class S1L5P4 {

  static void recursivePrintNto1(int i, int n)
  {
    // static void recursivePrintNto1(int n, int i)
    // if(n < i)
    // {
    //   return;
    // }
    // System.out.println(n);
    // recursivePrintNto1(n-1, i);

    if(i < 1)
    {
      return;
    }
    System.out.println(i);
    recursivePrintNto1(i-1, n);
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    recursivePrintNto1(n, n);
    sc.close();
  }
}
