
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<String> studentName = new  ArrayList<>(); // this line creates the empty array.// default capacity 10 increases the size= n+n/2+1

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(1);// remove element using index
        list.remove(Integer.valueOf(40)); // remove element using the element value.
        list.set(2,100);
        System.out.println(list);

        // we Can iterate our list using following 3 methods.
        for(Integer i : list)
        {
            System.out.println(i);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
