import java.util.HashMap;
import java.util.Map;
//keys are unique
// if same key is again added then value overrides
public class hashMap {
    public static void main(String[] args) {
        //ordering based on hash-- O(1)
        Map<String,Integer> numbers = new HashMap<>();
        //Map<String,Integer> numbers = new HashMap<>();
        //sorts according to key and then store--log n

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);

        System.out.println(numbers);

        //to avoid override
        numbers.putIfAbsent("four",4);
        numbers.putIfAbsent("one",5);

        //numbers.remove("four");
        System.out.println(numbers.containsKey("one"));
        System.out.println(numbers.containsValue(2));
        System.out.println(numbers.isEmpty());



        //to iterate
        for (Map.Entry<String,Integer>e:numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //for keys
        for (String key :numbers.keySet()){
            System.out.println(key);
        }
        //value set
        for (Integer val :numbers.values()){
            System.out.println(val);
        }





    }
}
