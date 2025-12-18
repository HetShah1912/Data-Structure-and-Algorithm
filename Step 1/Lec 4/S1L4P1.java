import java.util.Scanner;

public class S1L4P1 {

  static void countDigits(int n)
  {
    int count = 0;

    // int count = (int)(Math.log10(n) + 1);

    while(n > 0)
    {
      count++;
      n = n / 10;
    }
    System.out.println("Count of the No. is : " + count);
  }
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    countDigits(n);
    sc.close();
  }
}