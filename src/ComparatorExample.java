import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {


            List<Student> list = new ArrayList<Student>();

            list.add(new Student("anuj", 12));
            list.add(new Student("marij", 50));
            list.add(new Student("marij", 5));
            list.add(new Student("marij", 1));
            list.add(new Student("marij", 2));
            list.add(new Student("marij", 3));
            list.add(new Student("marij", 4));

            //Collections.sort(list); this statement will give error, if you not implement the comparator

            Student s1 = new Student("marij", 5);
            Student s2 = new Student("marij", 60);


            Collections.sort(list, new Comparator<Student>() {

                @Override
                public int compare(Student o1, Student o2) {
                    return o1.name.compareTo(o2.name);
                }

            });
            System.out.println(list);


        Collections.sort(list,(o1, o2) -> o1.name.compareTo(o2.name));


        System.out.println(list);
        }

    }

