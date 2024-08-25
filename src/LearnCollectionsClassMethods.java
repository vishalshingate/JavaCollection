import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClassMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(4);


        System.out.println(list);

        System.out.println(Collections.min(list)+"\n");

        System.out.println(Collections.max(list));

        System.out.println(Collections.frequency(list,1));// provide the list and search for frequency of that element.

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.swap(list,0,1);

        System.out.println(list);
    }
}
