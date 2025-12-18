import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S1L4P6 {
  static void printDivisior(int n)
  {
    System.out.println("Divisior of : " + n);
    // for(int i = 1; i <= n; i++)
    // {
    //   if(n % i == 0)
    //   {
    //     System.out.println(i);
    //   }
    // }

    List <Integer> divisior = new ArrayList<>();
    for(int i = 1; i <= Math.sqrt(n); i++)
    {
      if( n % i == 0)
      {
        divisior.add(i);
        if((n/i) != i)
        {
          divisior.add(n/i);
        }
      }
    }
    Collections.sort(divisior);
    System.out.println(divisior);
  }
  public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      printDivisior(n);
      sc.close();
  }
}
