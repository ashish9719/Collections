import java.util.*;

public class arrayClass {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        int index= Arrays.binarySearch(numbers,4);
        System.out.println("index is "+ index);

        Integer [] i ={22,12,23,1,34,45,66};
        Arrays.sort(i);

       for(int j :i){
           System.out.print(j+" ");
       }
        System.out.println();

       Integer num [] = {10,20,30,40,30};
       //used to fill all index with 1 ele
       Arrays.fill(num,5);
        for(int j :num){
            System.out.print(j+" ");
        }

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(22);
        list.add(34);
        list.add(33);
        list.add(33);

        System.out.println("min "+ Collections.min(list));
        System.out.println("max "+Collections.max(list));
        System.out.println("fre "+Collections.frequency(list,33));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anuj", 2));
        studentList.add(new Student("Shivam", 3));
        studentList.add(new Student("Rohit", 5));
        studentList.add(new Student("Ramesh", 4));

        System.out.println(studentList);


        Collections.sort(studentList);
        System.out.println(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(studentList);

        studentList.add(new Student("Aashish",22));
        // using lambda
        Collections.sort(studentList,(o1,o2)->o1.name.compareTo(o2.name));
        System.out.println(studentList);







    }
}
