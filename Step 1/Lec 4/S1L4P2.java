import java.util.Scanner;

public class S1L4P2 {

   static void reverseDigits(int n)
   {
    int rev = 0;
    while(n > 0)
    {
      int rem = n % 10;
      rev = (rev*10) + rem;
      n = n / 10;
    }
    System.out.println("Reverse of the no. is : "+rev);
   }
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    reverseDigits(n);
    sc.close();
  }
}
