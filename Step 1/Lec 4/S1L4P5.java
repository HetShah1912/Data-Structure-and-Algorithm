import java.util.Scanner;

public class S1L4P5 {
  static void armStrong(int n)
   {
    int original  = n;
    int sumOfCube = 0;
    
    while(n > 0)
    {
      int rem = n % 10;
      sumOfCube += Math.pow(rem,3);
      n = n / 10;
    }
    if(sumOfCube == original)
    {
      System.out.println("Armstrong : true");
    }
    else
    {
      System.out.println("Armstrong : false");
    }
   }
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      armStrong(n);
      sc.close();
  }
}
