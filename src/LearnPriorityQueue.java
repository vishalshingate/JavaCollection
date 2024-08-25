import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(50);
        queue.offer(45);
        queue.offer(33);
        queue.offer(43);
        queue.offer(53);
        queue.offer(63);

        System.out.println(queue);

        System.out.println(queue.poll());
        // here the smallest element have the biggest priority
        System.out.println(queue.peek());// will show the element which can be polled

        System.out.println(queue);

      System.out.println("Reverse priority ");
        Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());
        queue1.offer(50);
        queue1.offer(45);
        queue1.offer(33);
        queue1.offer(43);
        queue1.offer(53);
        queue1.offer(63);

        System.out.println(queue1);

        System.out.println(queue1.poll());
        // here the smallest element have the biggest priority
        System.out.println(queue1.peek());// will show the element which can be polled

        System.out.println(queue1);
    }
}
