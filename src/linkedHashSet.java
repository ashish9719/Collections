import java.util.LinkedHashSet;
import java.util.Set;
//uniqueness + order preserved
//O(1) due to hash
public class linkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

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
