import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(6);
        set.add(65);
        set.add(2);
        set.add(43);
        System.out.println(set);

        set.remove(2);

        set.remove(3);

        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.contains(1));

        System.out.println(set.contains(6));

        System.out.println(set.isEmpty());

        System.out.println(set.iterator().next());
        set.clear();
        System.out.println(set);
    }
}
