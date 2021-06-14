import java.util.*;
//unique + sorted
// implements using bst
//O(log n)
public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(43);
        set.add(10);
        set.add(12);
        set.add(20);
        set.add(33);
        set.add(33);
        System.out.println(set);

        set.remove(12);
        System.out.println(set);

        //ret boolean
        System.out.println(set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
