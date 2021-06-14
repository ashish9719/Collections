//implements min heap --gives higher prio to higher ele
import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        //for max heap that is to assign priority in reverse
        PriorityQueue<Integer> ppq = new PriorityQueue<>(Comparator.reverseOrder());

        ppq.offer(20);
        ppq.offer(30);
        ppq.offer(10);

        System.out.println(ppq);
        ppq.poll();
        System.out.println(ppq);
        System.out.println(ppq.peek());

    }
}
