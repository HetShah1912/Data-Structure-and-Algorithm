import java.util.Scanner;
public class S1L4P3 {

   static void reverseDigits(int n)
   {
    int rev = 0;
    int original  = n;
    while(n > 0)
    {
      int rem = n % 10;
      rev = (rev*10) + rem;
      n = n / 10;
    }
    if(rev == original)
    {
      System.out.println("Palindrome : true");
    }
    else{
      System.out.println("Not Palindrome : false");
    }
   }
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    reverseDigits(n);
    sc.close();
  }
}


