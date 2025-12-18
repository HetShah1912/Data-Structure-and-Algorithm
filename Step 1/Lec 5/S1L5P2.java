import java.util.Scanner;

public class S1L5P2 {
  static void recursivePrintName(int count, int n) {
    if (count > n) {
      return;
    }
    System.out.println("Het Shah");
    recursivePrintName(count+1 , n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    recursivePrintName(1, n);
    sc.close();
  }
}
