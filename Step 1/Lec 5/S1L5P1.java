import java.util.Scanner;;
public class S1L5P1 {
  static int count = 0;
  static int recursivePrintN(int n)
  {
    if(count == n)
    {
      return count;
    }
    System.out.println(count);
    count++;
    return recursivePrintN(n);
  }
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int total = recursivePrintN(n);
    System.out.println("Total times Run : " + total);
    sc.close();
  }
}
