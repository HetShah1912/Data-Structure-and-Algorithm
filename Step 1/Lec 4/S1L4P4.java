import java.util.Scanner;

public class S1L4P4 {
  static void gcd(int n1, int n2)
  {
    int hcf = 1;
    for(int i = 1; i<= Math.min(n1,n2); i++)
    {
      if(n1 % i == 0 && n2 % i == 0)
      {
        hcf = i;
      }
    }
    System.out.println("GCD of both no. is : "+ hcf);
  }
  public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      gcd(n1,n2);
      sc.close();
  }
}
