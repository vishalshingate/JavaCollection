import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);

        System.out.println(deque);

        deque.offerFirst(3);
        deque.offerLast(4);

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);

        System.out.println(deque.poll());

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
