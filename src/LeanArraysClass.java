import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeanArraysClass {
    // all the methods of this arrays class are static so you need to call them for example Arrays.sort()
    public static void main(String[] args) {
       int [] a = {10,3,5,7,8,9,9,4};

       int index = Arrays.binarySearch(a, 10);

       System.out.println("Index of 10"+ index);

       Arrays.sort(a);
       for (int i = 0; i < a.length; i++) {
           System.out.println("Sorted Array" + a[i]);
       }
       System.out.println(Arrays.toString(a));// to print the array element.

        Arrays.fill(a, 10); // fil 10 to all places
        System.out.println(Arrays.toString(a));



        List<Integer> b= Arrays.asList(1,3,5,7,8,9,99);

        List<int[]> c = List.of(a);
        System.out.println(Arrays.toString(c.get(0)));
    }
}
