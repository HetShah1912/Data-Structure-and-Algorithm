import java.util.Scanner;

public class S1L2P17 {

    // Output
    //         A         
    //       A B C       
    //     A B C D C     
    //   A B C D E D C   
    // A B C D E F E D C 
    
   static void printPattern(int n)
   {    
    for(int i = 0; i < n; i++)
    {
      // Spaces 
      for(int j = 0; j < n-i-1; j++)
      {
        System.out.print("  ");
      }
      // Char
      char ch = 'A';
      int breakpoint = (2*i+1)/2;
      for(int k = 0; k < 2*i+1; k++)
      {
        System.out.print(ch + " ");
        if(k < breakpoint)
        {
          ch++;
        }
        else{
          ch--;
        }
      }
      // Spaces
      for(int l = 0; l < n-i-1; l++)
      {
        System.out.print("  ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}
