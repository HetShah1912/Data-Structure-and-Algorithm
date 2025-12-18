import java.util.HashSet;
import java.util.Set;

public class S1L3_Set {
  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();

    set.add(23);
    set.add(54);
    set.add(31);
    set.add(78);

    System.out.println(set);

    set.remove(54);

    System.out.println(set);

    System.out.println(set.contains(54));
    
  }
}
