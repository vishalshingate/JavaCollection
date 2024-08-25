import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return rollNo == that.rollNo && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }
    // compare using roll number
  /*  @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }*/
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }
}
