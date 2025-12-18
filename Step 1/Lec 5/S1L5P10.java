import java.util.Scanner;

public class S1L5P10 {
  // static void checkPalindrome(String s, int length)
  // {
  //   String newStr = "";
  //   for(int i = 0; i < length; i++)
  //   {
  //     newStr += s.charAt(length-i-1);
  //     System.out.println(newStr);
  //     System.out.println(s[i]);
  //   }
  //   if(s.equals(newStr))
  //   {
  //     System.out.println("Palindrome");
  //   }
  //   else{
  //     System.out.println("Not Palindrome");
  //   }
  static boolean checkPalindrome(String s, int i)
  {
    if(i >= (s.length()/2))
    {
      return true;
    }
    if(s.charAt(i) != s.charAt(s.length()-i-1))
    {
      return false;
    }
    return checkPalindrome(s, i+1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean palindrome = checkPalindrome(str, 0);
    System.out.println(palindrome);
    sc.close();
  }
}
