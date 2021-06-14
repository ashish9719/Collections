import java.util.ArrayDeque;
//ele can be added and removed from both sides
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //adds at end
        adq.offer(10);
        //adds at first
        adq.offerFirst(22);
        adq.offerFirst(33);
        adq.offerLast(34);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

    }
}
