import java.util.LinkedList;
import java.util.Queue;

public class S1L3_QueueLinkedList {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    // Adding Element in Queue
    queue.offer(12);
    queue.offer(24);
    queue.offer(36);

    System.out.println(queue);

    // Removing Element in Queue
    System.out.println(queue.poll());

    System.out.println(queue);

    // Get element at Front
    System.out.println(queue.peek());
  }
}
