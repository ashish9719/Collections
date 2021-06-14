import java.util.HashSet;
import java.util.Set;

//set-- no duplicate elements
//hashing is used so no dup present
//and due to hash order is diff than added
public class hashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

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
