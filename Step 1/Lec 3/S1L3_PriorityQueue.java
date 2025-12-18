import java.util.PriorityQueue;
import java.util.Queue;

public class S1L3_PriorityQueue {
  public static void main(String[] args) {

    Queue<Integer> pqueue = new PriorityQueue<>();

    pqueue.offer(24);
    pqueue.offer(12);
    pqueue.offer(36);
    pqueue.offer(48);

    System.out.println(pqueue);
    
    System.out.println(pqueue.poll());
    System.out.println(pqueue);

    System.out.println(pqueue.peek());
  }
}
