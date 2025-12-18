import java.util.Scanner;

public class S1L6P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int noOfQuery = sc.nextInt();

    // Pre Computation
    int[] hash = new int[26];
    for(int i = 0; i < str.length(); i++)
    {
      hash[str.charAt(i)-'a'] += 1;
    }

    while(noOfQuery != 0)
    {
      char ch = sc.next().charAt(0);
      int key = ch - 'a';
      System.out.println(ch + " " + hash[key]);
      noOfQuery--;
    }
    sc.close();
  }
}
