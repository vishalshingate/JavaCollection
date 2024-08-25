import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(10);
        queue.offer(12);
        queue.offer(33);
        queue.offer(43);
        queue.offer(53);
        queue.offer(63);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek()); // will show the element which can be polled
    }
}
