import java.util.*;
//queue-- FIFO
public class Linkedlist {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // add throws exception if not added
        // whereas offer gives false
        queue.offer(10);   //-- push ret true or fal
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);
        //ret null if empty
        //remove ret exception
        System.out.println(queue.poll());// --pop

        //peeek will return null if empty
        //element will throw exception
        System.out.println(queue.peek());

    }
}
