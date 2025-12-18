import java.util.Scanner;

public class S1L6P3 {
  static int freq(String str, char ch)
  {
    int count = 0;
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i)==ch)
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch = sc.next().charAt(0);
    
    int freq = freq(str, ch);
    System.out.println("Frequency of Char "+ch+ " is "+freq);
    sc.close();
  }
}
