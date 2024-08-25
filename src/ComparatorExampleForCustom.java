import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleForCustom {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student ("anuj",12));
        list.add(new Student ("marij",50));
        list.add(new Student ("marij",5));
        list.add(new Student ("marij",1));
        list.add(new Student ("marij",2));
        list.add(new Student ("marij",3));
        list.add(new Student ("marij",4));

        //Collections.sort(list); this statement will give error, if you not implement the comparator

        Student s1 = new Student ("marij",5);
        Student s2 = new Student ("marij",60);

        System.out.println(s1.compareTo(s2));

        Collections.sort(list);
        System.out.println(list);
    }
}
