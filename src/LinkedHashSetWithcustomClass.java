import java.util.LinkedHashSet;

public class LinkedHashSetWithcustomClass {
    public static void main(String[] args) {
        LinkedHashSet<StudentClass> students = new LinkedHashSet<>();

        students.add(new StudentClass("vishal",1));
        students.add(new StudentClass("vishal",1));
        students.add(new StudentClass("vishal",1));

        System.out.println(students);
    }
}
