import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("A", 21);
        map.put("B", 12);
        map.put("C", 33);
        map.put("D", 44);
        map.put("E", 15);

        map.put("A", 22);
        System.out.println(map);

        map.remove("A");
        map.putIfAbsent("A", 21);

        System.out.println(map);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Using keySet");
        for (String entry : map.keySet()) {
            System.out.println(entry + ": " + map.get(entry));
        }

        for (Integer value : map.values()) {
            System.out.println(value );
        }

    }
}
