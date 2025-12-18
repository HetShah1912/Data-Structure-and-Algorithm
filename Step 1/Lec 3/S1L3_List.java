import java.util.ArrayList;
import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;

public class S1L3_List {
  public static void main(String[] args) {

    // ArrayList

    // Making obj
    List<Integer> lst = new ArrayList<>();

    // Making LinkedList
    // List<Integer> lst = new LinkedList<>();

    // Add Element to list
    lst.add(1);
    lst.add(2);
    lst.add(3);
    System.out.println(lst);

    lst.add(4);
    System.out.println(lst);

    // Add Element at given Index
    lst.add(2, 5);
    System.out.println(lst);

    ArrayList<Integer> newLst = new ArrayList<>();
    newLst.add(60);
    newLst.add(70);

    // Add List to another List
    lst.addAll(newLst);
    System.out.println(lst);

    System.out.println(lst.get(5));

    // Remove Element from given Index
    lst.remove(4);
    System.out.println(lst);

    // Remove Element from its Value
    lst.remove(Integer.valueOf(70));
    System.out.println(lst);

    // Update Value at given Index
    lst.set(2, 50);
    System.out.println(lst);

    // Checking Element Availability in List
    System.out.println(lst.contains(3));

    // Iterating through List 
    for(int i = 0; i < lst.size(); i++)
    {
      System.out.println("Element at "+i+ " Position is : "+lst.get(i));
    }

    for(Integer element : lst)
    {
      System.out.println("For Each Element "+element);
    }

    // Iterating through Iterator
    Iterator<Integer> it = lst.iterator();

    while(it.hasNext())
    {
      System.out.println("Iterator "+it.next());
    }

  }
}
