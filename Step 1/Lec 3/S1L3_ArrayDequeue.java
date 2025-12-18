import java.util.ArrayDeque;

public class S1L3_ArrayDequeue {
  public static void main(String[] args) {
    ArrayDeque<Integer> dq = new ArrayDeque<>();

    dq.offer(23);
    dq.offerFirst(12);
    dq.offerLast(45);
    dq.offer(48);

    System.out.println(dq);

    System.out.println(dq.peek());
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());

    System.out.println(dq.poll());
    System.out.println("After poll() " + dq);
    System.out.println(dq.pollFirst());
    System.out.println("After pollFirst() " + dq);
    System.out.println(dq.pollLast());
    System.out.println("After pollLast() " + dq);

  }
}
