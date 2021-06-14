import java.util.*;
//dynamic arrays
//when size changed--internally copies to another array
// new size is n+ (n/2)+1
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("ashish");
        students.add("ash");

        System.out.println(students);
        students.add(1,"aaa");
        System.out.println(students);

        System.out.println(students.get(1));


        for (int i = 0; i < students.size(); i++) {
            System.out.println("ele :"+  students.get(i) );
        }

        for (String s: students) {
            System.out.println("hi "+ s);
        }
        Iterator <String> it = students.iterator();
        while(it.hasNext()){
            System.out.println("itr : "+ it.next());
        }

        students.remove(1);
        System.out.println(students);
        students.remove("ash");
        System.out.println(students);

        students.set(0,"Ashish");
        System.out.println(students);

        System.out.println(students.contains("aaa"));

        students.clear();
        System.out.println(students);
    }
}
