import java.util.Scanner;

public class S1L2P19 {

  // Output
  // **********
  // ****  ****
  // ***    ***
  // **      **
  // *        *
  // *        *
  // **      **
  // ***    ***
  // ****  ****
  // **********

  static void printPattern(int n)
  {
    // // Solution by Het Shah
    // for(int i = 0; i < n; i++)
    // {
    //   // Spaces
    //   for(int j = 0; j < n-i; j++)
    //   {
    //     System.out.print("*");
    //   }
    //   // Star
    //   for(int j = 0; j < 2*i+1; j++)
    //   {
    //     System.out.print(" ");
    //   }
    //   // Spaces
    //   for(int j = 0; j < n-i; j++)
    //   {
    //     System.out.print( "*");
    //   }
    //   System.out.println();
    // }
    // int space = 9;
    // for(int i = 0; i < n; i++)
    // {
    //   // Star
    //   for(int j = 0; j <= i; j++)
    //   {
    //     System.out.print("*");
    //   }
    //   // Spaces
    //   for(int j = 0; j < space; j++)
    //   {
    //     System.out.print(" ");
    //   }
    //   // Star
    //   for(int j = 0; j <= i; j++)
    //   {
    //     System.out.print( "*");
    //   }
    //   System.out.println();
    //   space -= 2;
    // }

    // Striver
    // Upper Part
    int space = 0;
    for(int i =0; i < n; i++)
    {
      // Star going in decreasing order
      for(int j = 0; j < n - i; j++)
      {
        System.out.print("*");
      }
      // Space going incresing by 2
      for(int j = 0; j < space; j++)
      {
        System.out.print(" ");
      }
      // Star going in decreasing order
      for(int j = 0; j < n - i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
      space += 2;
    }
    space = (2 * n) - 2;
    // Lower Part
    for(int i =0; i < n; i++)
    {
      // Star going in inreasing order
      for(int j = 0; j <= i; j++)
      {
        System.out.print("*");
      }
      // Space going decreasing by 2
      for(int j = 0; j < space; j++)
      {
        System.out.print(" ");
      }
      // Star going in inreasing order
      for(int j = 0; j <= i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
      space -= 2;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}
